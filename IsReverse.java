package Solution;

import java.util.Scanner;

public class IsReverse {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String s = scanner.nextLine();
        String s = "xsukkusxf";
            StringBuffer sb1 = new StringBuffer(s);
            StringBuffer sb2 = new StringBuffer(s);
            int n = 0;int m = 0;
            for (int i = 0; i < s.length(); i++) {
                if (sb1.charAt(i) != sb1.charAt(s.length() - 1 - i)) {
                    sb1.insert(sb1.length() - i, s.charAt(i));
                    break;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (sb2.charAt(i) != sb2.charAt(s.length() - 1 - i)) {
                    sb2.insert(i, s.charAt(s.length() - 1 - i));
                    break;
                }
            }
            String s1 = (new StringBuffer(sb1)).toString();
            if (s1.equals((sb1.reverse()).toString())){
                n = 1;
            }
        String s2 = (new StringBuffer(sb2)).toString();
        if (s2.equals((sb2.reverse()).toString())){
            m = 1;
        }
            if (m + n == 1){
                System.out.println("YES");
            }else if (m + n == 0){
                System.out.println("NO");
//            }
        }
    }
}
