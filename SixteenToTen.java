package Solution;

import java.util.Scanner;

public class SixteenToTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
//        String s = "0xC460";
            int r = 0;
            double n = 0;
            for (int i = s.length() - 1, j = 0; i > 1; i--, j++) {
                if (s.charAt(i) == 'A') {
                    n = 10 * Math.pow(16, j);
                } else if (s.charAt(i) == 'B') {
                    n = 11 * Math.pow(16, j);
                } else if (s.charAt(i) == 'C') {
                    n = 12 * Math.pow(16, j);
                } else if (s.charAt(i) == 'D') {
                    n = 13 * Math.pow(16, j);
                } else if (s.charAt(i) == 'E') {
                    n = 14 * Math.pow(16, j);
                } else if (s.charAt(i) == 'F') {
                    n = 15 * Math.pow(16, j);
                } else {
                    n = ((int) s.charAt(i) - 48) * Math.pow(16, j);
                }
                r += n;
                n = 0;
            }
            System.out.println(String.valueOf(r));
        }
    }
}

