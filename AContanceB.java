package Solution;

import java.util.Scanner;

public class AContanceB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String sa = scanner.next();
            String sb = scanner.next();
            System.out.println(sa);
            System.out.println(sb);
//            String sa = "ABCDFYE";
//                String sb = "CDE";
            if (sa.length() < sb.length()) {
                System.out.println("No");
                break;
            }
            char[] charsa = sa.toCharArray();
            char[] charsb = sb.toCharArray();
            for (int i = 0;i < charsb.length;i++){
                for (int j = 0;j < charsa.length;j++){
                    if (charsa[j] == charsb[i]){
                        charsa[j] = charsb[i] = '*';
                        break;
                    }

                }
            }

            int i = 0;
            for (;i < charsb.length;i++) {
                if (charsb[i] != '*') {
                    System.out.println("No");
                    break;
                }
            }
            if (i == charsb.length){
                System.out.println("Yes");
            }
        }
    }
}
