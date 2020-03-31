package Important;

import java.util.ArrayList;
import java.util.Scanner;
//大家都知道斐波那契数列，现在要求输入一个整数n，
//请你输出斐波那契数列的第n项（从0开始，第0项为0）。
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList list = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c = 0;
        list.add(a);
        list.add(b);
        for(int i = 0;i < 40;i++){
            c = a+b;
            list.add(c);
            a=b;
            b=c;
        }
        System.out.println(list.get(n));
    }
    public int Fibonacci(int n) {
        if (n == 0){
            return 0;
        }else if (n == 1 && n == 2){
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        //0,1,1,2,3,5
        for (int i = 3;i <= n;i++){
            c = a + b;//2,3,5
            a = b;//1,2
            b = c;//2,3
        }
        return c;
    }
}
