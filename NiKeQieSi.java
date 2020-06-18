package Solution;

import java.util.*;

public class NiKeQieSi {
    //输出有问题，不知道为什么，估计是因为数字没有转换成String类型吧
//    public static void main(String[] arg) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            int j = 1;
//            for (int i = 0; i < n; i++) {
//                if (i == n - 1) {
//                    System.out.print(n * (n - 1) + j);
//                    break;
//                } else {
//                    System.out.print(n * (n - 1) + j + "+");
//                    j += 2;
//                }
//            }
//        }
//        System.out.println();
//        sc.close();
//    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
//            int n = 6;
            int j = 1;
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    sb.append(n * (n - 1) + j);
                    //System.out.print(n * (n - 1) + j);
                    break;
                } else {
                    sb.append(n * (n - 1) + j + "+");
                   // System.out.print(n * (n - 1) + j + "+");
                    j += 2;
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
