package HomeWork;

import java.io.*;


public class IOAbout1 {
    //将txt文件从D盘复制到C盘
    public static void main(String[] args) {
        String filename = "D:\\test0523.txt";
        String filename1 = "E:\\test0523.txt";
        try {
            //1.先输入到应用程序中
            Reader reader = new FileReader(filename);
            BufferedReader in = new BufferedReader(reader);
            //2.再输出至另一个文件中
            Writer writer = new FileWriter(filename1);//只能写字符数组
            PrintWriter pw = new PrintWriter(writer);//此时可以写流字符串
            String line = in.readLine();
            while (line != null){
                pw.println(line);    //pw.write(line);
                line = in.readLine();
                pw.flush();
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    //将图片从D 盘读取到E 盘
//    public static void main(String[] args) {
//        //源地址
//        String filename = "D:\\桌面1.jpg";
//        //目的地址
//        String filename1 = "E:\\桌面1.jpg";
//        try {
//            InputStream inputStream = new FileInputStream(filename);
//            BufferedInputStream bf = new BufferedInputStream(inputStream);
//            OutputStream outputStream = new FileOutputStream(filename1);
//            BufferedOutputStream bos = new BufferedOutputStream(outputStream);
//            //可以在读写操作前先得知数据流里有多少个字节可以读取
//            int n = bf.available();
//            byte[] bytes = new byte[n];
//            int len;
//            //read () 方法，这个方法 从输入流中读取数据的下一个字源节。
//            // 返回 0 到 255 范围内的 int 字节值。
//            // 如果因为已经到达流末尾而没有可用的字节，则返回值 -1
//            while ((len = inputStream.read(bytes)) != -1) {
//                //写入内容
//                bos.write(bytes, 0, len);
//                bos.flush();
//            }
//            outputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
