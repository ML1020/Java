package Solution;

import java.util.*;
public class Bei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  int m = scanner.nextInt();
        int n = scanner.nextInt();
        String s2 = scanner.nextLine();
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int len = s.length();
        int i;
        int max = 0;

        for (i = 0; i < len - 1; i++) {
            sb.append(s.charAt(i));
            if (s.lastIndexOf(sb.toString()) == len - 1 - i) {
                max = Math.max(max, i);
            }
        }
        System.out.println(max);
        sb = new StringBuilder(s);
        for (int j = max + 1; j < len; j++) {
            sb2.append(s.charAt(j));
        }
        for (int k = 0; k < n - 1; k++) {
            sb.append(sb2.toString());
        }
        System.out.println(sb.toString());
    }
}