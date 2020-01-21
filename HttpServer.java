import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//自行解包、处理，响应http协议格式
//浏览器发送请求时，用封装好的http格式
//处理时，使用字符串解析
//socket连接方式
public class HttpServer {
    //端口号
    public static final int POPT = 9999;
    //线程池
    //获取处理器核数
    private static final int COUNT = Runtime.getRuntime()
            .availableProcessors();
    //处理的任务量和线程数量、CPU、内存等资源都相关
    //一般推荐处理器核数数量的线程
    private static final ExecutorService EXE
            = Executors.newFixedThreadPool(COUNT);//固定大小线程池

    private static final Map<String,Object> SESSION = new HashMap<>();
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(POPT);  //直接抛异常
        while (true) {
            //使用此方法接受，返回socket对象.
            //阻塞式方法,若没获取到则阻塞，获取到则开启线程处理
            Socket socket = server.accept();
            EXE.submit(new HttpTask(socket));
        }
    }
}

//Http任务处理类
class HttpTask implements Runnable {
    private Socket socket;

    public HttpTask(Socket socket) {  //构造方法
        this.socket = socket;
    }

    @Override
    public void run() {
        //(重写方法run无法抛异常，需在内部处理)
        //(关闭流)
        //获取客户端请求数据：输入流
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        //获取客户端输出流，返回响应数据
        OutputStream os = null;
        //往客户端打印数据
        PrintWriter pw = null;
        try {
            try {
                is = socket.getInputStream();//使用socket获取输入流，读取请求数据
                //字节流需要包装成字符类型(转换流)
                isr = new InputStreamReader(is, "UTF-8");
                //从缓冲流中读取，效率高
                br = new BufferedReader(isr);
                Request request = new Request();
                //请求数据的解析：http协议报的解包
                // 1.解析请求行（第一行）：method url version
                String requestLine = br.readLine();//请求行
                String[] requestLines = requestLine.split(" ");
                request.setMethod(requestLines[0]);
                //可能为http://localhost:9999/xxx?username=stu&password=123
                String url = requestLines[1];
                if(url.contains("?")){  //？后续的为参数值
                    String parameters = url.substring(url.indexOf("?")+1);
                    request.parseParameters(parameters);
                    url = url.substring(0, url.indexOf("?"));
                }
                request.setUrl(url);
                request.setVersion(requestLines[2]);
                // 2.解析请求头：
                // key:value每个换行，以空行作为结尾
                String header;
                while((header=br.readLine())!=null//读取到空行请求行结束
                        && header.length()!=0){//split或是substring获取
                    //header.length()!=0不是空行
                    //获取key，value
                    String key = header.substring(0, header.indexOf(":"));
                    String value = header.substring(header.indexOf(":")+1);
                    request.addHeader(key, value.trim()); //trim()去掉空格
                }
                //如果是post请求，则有请求体；如果是get请求，则没有请求体
                // POST请求，需要根据请求头Content-Length获取请求体的长度
                if("POST".equals(request.getMethod())){
                    String len = request.getHeader("Content-Length");
                    if(len!=null){
                        int l = Integer.parseInt(len);
                        char[] chars = new char[l];
                        br.read(chars, 0, l);
                        //请求参数格式：username=stu&password=123
                        String requestBody = new String(chars);
                        request.parseParameters(requestBody);
                    }
                }
                System.out.println(request);
                os = socket.getOutputStream();//进行客户端的响应，根据URL返回具体数据
                pw = new PrintWriter(os,true);

                if("/302".equals(request.getUrl())){
                    pw.println("HTTP/1.1 302 重定向");
                    pw.println("Content-Type: text/html;charset=utf-8");
                    pw.println("Location: https://www.baidu.com");
                }else if ("/login".equals(request.getUrl())){
                    //判断用户名密码是否满足条件
                    String sesionId = request.getHeader("SESSION");
                    if (sesionId == null){
                        String username = request.getParameter("username");
                        String password = request.getParameter("password");
                        //将获取到的东西放入cookie中
                    }
                    pw.println("HTTP/1.1 200 OK");
                    pw.println("Set-Cookie: SESSIONID" + request.getParameter());
                    pw.println("Content-Type: text/html;charset=utf-8");
                    pw.println("<h2>欢迎用户["+
                            request.getParameter("username")+"]登录</h2>");
                }else if("/setCookie".equals(request.getUrl())){
                    pw.println("HTTP/1.1 200 OK");
                    String sesionId = UUID.randomUUID().toString();
                    pw.println("setCookie: SESSION=" + sesionId);
                    pw.println("Content-Type: text/html;charset=utf-8");
                }else if ("getCookie".equals(request.getUrl())){

                }else{
                    //getResourceAsStream()将资源当作流返回
                    //name".":访问/login.html，转化为访问./login.html
                    InputStream htmlIs = HttpServer.class.getClassLoader()
                            .getResourceAsStream("."+request.getUrl());
                    if (htmlIs != null){
                        pw.println("HTTP/1.1 200 OK");
                        pw.println("Content-Type: text;charset=utf-8");
                        pw.println();
                        //返回webapp下的静态资源文件内容
                        InputStreamReader htmlIsr = new InputStreamReader(htmlIs);//字符字节转换流
                        BufferedReader htmlBr = new BufferedReader(htmlIsr);
                        String content;
                        while ((content = htmlBr.readLine()) != null){
                            pw.println(content);
                        }
                    }else {
                        //返回404
                        pw.println("HTTP/1.1 404 Not Found");
                        pw.println("Content-Type: text/html;charset=utf-8");
                        pw.println();
                        pw.println("<h2>找不到资源<h2>");
                    }
                }
            } finally {
                //反向释放资源(反向关闭流)
                if (br != null) {
                    br.close();
                }
                if (isr != null) {
                    isr.close();
                }
                if (is != null) {
                    is.close();
                }
                //关闭输出流
                if (pw != null){
                    pw.close();
                }
                if (os != null){
                    os.close();
                }
                //关闭socket对象
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}