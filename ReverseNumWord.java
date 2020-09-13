package Solution;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
//        int n = 2;
//        String s = "gogogoout";
        StringBuffer sb = new StringBuffer(s);
        StringBuffer sb1 = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        if (n >= s.length()) {
            sb.reverse();
            System.out.println(sb.toString());
        } else {
            //将n个字母入栈，然后出栈加入到输出的字符串中
            while (i <= s.length() - n) {
                for (int j = i; j < n + i; j++) {
                    stack.push(s.charAt(j));
                }
                while (!stack.isEmpty()) {
                    sb1.append(stack.pop());
                }
                i += n;
            }
            while (i > s.length() - n) {
                for (int j = s.length() - 1; j >= i; j--) {
                    sb1.append(s.charAt(j));
                }
                break;
            }
            System.out.println(sb1.toString());
        }
    }
}
