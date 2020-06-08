package Solution;

import java.util.Scanner;
//A,B,C三个人是好朋友,每个人手里都有一些糖果,
// 我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
//A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
//现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。
// 这里保证最多只有一组整数A,B,C满足所有题设条件。
//输入：输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。 范围均在-30到30之间(闭区间)。
//输出：输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。
// 如果不存在这样的整数A，B，C，则输出No
public class Cindy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] r = new int[4];
        int i = 0;
        while (i < 4) {
            r[i] = sc.nextInt();
            i++;
        }
        int A = (r[0] + r[2]) / 2;
        int B = (r[1] + r[3]) / 2;
        int C = Math.abs((r[1] - r[3]) / 2);
        if ((r[0] + r[2]) % 2 == 0 && (r[1] + r[3]) % 2 == 0 && (A + B == r[2])) {
            System.out.print(A + " " + B + " " + C);
        } else {
            System.out.println("No");
        }
    }
}
