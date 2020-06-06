package HomeWork;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIP {
    public static void main(String[] args) throws Exception {
        //创建输入流 数据源是D:/Lisa.txt
        FileInputStream in = new FileInputStream("D:\\Hello.txt");
        //创建输出流 D：/0327.gz
        FileOutputStream fos = new FileOutputStream("D:\\test.gz");
        GZIPOutputStream out = new GZIPOutputStream(fos);
        System.out.println("Writing compressing file from D:/Lisa.txt to D:/test.gz");
        int c;
        while ((c = in.read()) != -1) out.write(c); //写压缩文件

        in.close();//关闭输入流
        out.close();//关闭输出流
        System.out.println("Reading file form D:/test.gz to monitor");
        //创建输入流 数据源是D:/0327.gz
        FileInputStream fis = new FileInputStream("D:/test.gz");
        //输入流 流gzip格式的文件
        GZIPInputStream gzip = new GZIPInputStream(fis);
        //字节通向字符
        InputStreamReader isr = new InputStreamReader(gzip);
        //带缓冲的字符流入流
        BufferedReader in2 = new BufferedReader(isr);

        String s;
        while ((s = in2.readLine()) != null)
            System.out.println(s);

        //关闭字符流
        in2.close();
        System.out.println("Writing decompression to F:/newHello.txt");
        //gzip格式的输入流
        GZIPInputStream in3 = new GZIPInputStream(new FileInputStream("D:\\test.gz"));
        FileOutputStream out2 = new FileOutputStream("D:/newHello.txt");
        while ((c = in3.read()) != -1)
            out2.write(c);
        in3.close();
        out2.close();
    }
}
