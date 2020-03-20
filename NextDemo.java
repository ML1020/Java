package Demo;
import java.util.Scanner;
public class NextDemo {
    //Scanner中nextLine()方法和next()方法的区别
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入字符串（next）：");
        String str = input.next();
        System.out.println(str);

        System.out.println("请输入字符串（nextLine）：");
        String str1 = input.nextLine();
        System.out.println(str1);

    }
}
