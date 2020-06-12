package Solution;

import java.util.Scanner;

public class NumberReserve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer s = new StringBuffer();
        for (int i = n; i > 0; ) {
            int r = i % 10;
            s.append(r + "");
            i = i / 10;
        }
        System.out.print(s);
    }
}
