package Demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStreamDemo {
    public static void main(String[] args) throws Exception {   // 异常抛出不处理
// 第1步：使用File类找到一个文件
        File f = new File("d:" + File.separator + "test.txt"); // 声明File对象
// 第2步：通过子类实例化父类对象
        OutputStream out = null;
// 准备好一个输出的对象
        out = new FileOutputStream(f);
// 通过对象多态性进行实例化
// 第3步：准备一个字符串
        String str = "Hello World!!!";
        // 字符串转byte数组
        byte b[] = str.getBytes();
// 将内容输出,进行写操作
        out.write(b);
// 第4步：关闭输出流(此时没有关闭)
        // out.close();
    }
}


