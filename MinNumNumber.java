package Solution;

import java.util.*;

/**
 * 组个最小数
 * 题目描述
 * 给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。
 * 目标是使得最后得到的数尽可能小（注意0不能做首位）。
 * 例如：给定两个0，两个1，三个5，一个8，我们得到的最小的数就是
 * 10015558。现给定数字，请编写程序输出能够组成的最小的数。
 * 输入描述:
 * 每个输入包含1个测试用例。每个测试用例在一行中给出10个非负整数，
 * 顺序表示我们拥有数字0、数字1、……数字9的个数。整数间用一个空格分隔。
 * 10个数字的总个数不超过50，且至少拥有1个非0的数字。
 * 输出描述:
 * 在一行中输出能够组成的最小的数。
 * 输入例子:
 * 2 2 0 0 0 3 0 0 1 0
 * 输出例子:
 * 10015558
 * */
public class MinNumNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0;i < 10;i++){
            arr[i] = sc.nextInt();
        }
        StringBuffer sb = new StringBuffer();

        for (int i = 0;i < 10;i++){
            if(arr[i] > 0 && i != 0){
                sb.append(i);
                arr[i]--;
                break;
            }
        }
        for(int i = 0;i < 10;i++){
            if (sb.length() == 1 && arr[0] != 0){
                while (arr[0] > 0){
                    sb.append(0);
                    arr[0]--;
                }
            }
            if (arr[i] > 0 && i != 0){
                while (arr[i] > 0) {
                    sb.append(i);
                    arr[i]--;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
