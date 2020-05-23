package HomeWork;

import java.io.*;
import java.nio.BufferOverflowException;

public class IOAbout {
    //将txt文件从D盘复制到C盘
    public static void main(String[] args) {
        String filename = "D:\\test0523.txt";
        String filename1 = "E:\\test0523.txt";
        try {
            Reader reader = new FileReader(filename);
            BufferedReader in = new BufferedReader(reader);
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

}
