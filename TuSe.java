package Solution;

import java.util.Scanner;

public class TuSe {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String syi = scanner.nextLine();   //小丽有的
//        String sxu = scanner.nextLine();    //所需要的
        String syi = "AAB";
        String sxu = "ABC";
        StringBuffer sb1 = new StringBuffer(syi);
        StringBuffer sb2 = new StringBuffer(sxu);
        if (sxu.equals(syi)){
            System.out.println(sxu.length());
        }
        int count = 0;
        for (int i = 0; i < syi.length(); i++) {
            for (int j = 0; j < sxu.length(); j++) {
                if (sb1.charAt(i) == sb2.charAt(j)) {
                    count++;
                    sb2.replace(j,j+1,"*");
                    break;
                }
            }
        }
        System.out.println(count);
//        int i = 0;
//        int j = 0;
//        while (i < syi.length()){
//            while (j <sxu.length()){
//                if (syi.charAt(i) == sxu.charAt(j)){
//                    count++;
//                    i++;
//                    j++;
//                }else if (syi.charAt(i) != sxu.charAt(j)){
//                    j++;
//                }
//            }
//        }


    }
}
