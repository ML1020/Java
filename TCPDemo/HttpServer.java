package Demo.TCPDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//HTTP 请求服务端.实现将客户端输入的英文单词翻译为中文。
//TCP服务端
public class HttpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        System.out.println("服务器启动了....");
        boolean isShow=true; // 设置第一次输出[服务器启动了....]，启动后不再显示。
        while (true){
            try {
                Socket client = server.accept();
                String clientName=client.getInetAddress().getLocalHost().toString();
                if(isShow){
                    System.out.println("客户端:"+clientName+"已连接到服务器");
                }
                isShow=false;
                BufferedReader br = new BufferedReader(new
                        InputStreamReader(client.getInputStream()));
                String word = br.readLine(); // word 客户端发送来的消息
                if(null != word){
                    System.out.println("客户端输入的是:"+word+",服务器响应的是:"+word);
                    BufferedWriter bw = new BufferedWriter(new
                            OutputStreamWriter(client.getOutputStream()));
                    bw.write(word+"\n");
                    bw.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
