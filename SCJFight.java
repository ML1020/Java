package Solution;

import java.util.Scanner;

public class SCJFight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ay = 0, by = 0, p = 0;
        int ac = 0, aj = 0, ab = 0;
        int bc = 0, bj = 0, bb = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            String b = scanner.next();
//            String a = "C";
//            String b = "J";
            if (a.equals("C") && b.equals("J")) {
                ay++;
                ac++;
            } else if (a.equals("J") && b.equals("B")) {
                ay++;
                aj++;
            } else if (a.equals("B") && b.equals("C")) {
                ay++;
                ab++;
            } else if (a.equals(b)) {
                p++;
            } else if (b.equals("C") && a.equals("J")) {
                by++;
                bc++;
            } else if (b.equals("J") && a.equals("B")) {
                by++;
                bj++;
            } else if (b.equals("B") && a.equals("C")) {
                by++;
                bb++;
            }
        }
        String r1 = String.valueOf(ay);
        String r2 = String.valueOf(p);
        String r3 = String.valueOf(by);
        System.out.println(r1 + " " + r2 + " " + r3);
        System.out.println(r3 + " " + r2 + " " + r1);
        if (Math.max(aj, Math.max(ab, ac)) == ab) {
            System.out.printf("B ");
        } else if (Math.max(aj, Math.max(ab, ac)) == ac) {
            System.out.printf("C ");
        } else {
            System.out.printf("J ");
        }
        if (Math.max(bj, Math.max(bb, bc)) == bb) {
            System.out.println("B");
        } else if (Math.max(bj, Math.max(bb, bc)) == bc) {
            System.out.println("C");
        } else {
            System.out.println("J");
        }
    }
}
