package Solution;
//斐波那契数列
import java.util.Scanner;
//形如1, 1, 2, 3, 5, 8, 13, 21, 34, 55的数列，后一位是前面两位相加（斐波那契数列），
// 写出函数要求找到第 N 位是多少，
// 如：fib(3) => 3 ， fib(5) => 8, 要求时间复杂度为O(n)。
public class Fib {
    public static long fib(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long[] it = new long[1000];
        it[0] = 1;
        it[1] = 1;
        long result = 0;
        for (int i = 2; i <= num; i++) {
            it[i] = it[i - 1] + it[i - 2];
            result = it[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fib(num));
    }
}
