package Solution;

import java.util.Scanner;

//买苹果，6个8个，输出最少的袋数
public class BuyApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 12;
        int x = n / 8;
        int y = n / 6;
        int count = n/6;
        boolean flag = true;
//        if (n % 8 == 0) {
//            System.out.println(n / 8);
//        }
        for (int j = 0; j <= y; j++) {
            for (int i = 0; i <= x; i++){
                if (8 * i + 6 * j == n) {
                    count = Math.min(count,i+j);
                    flag = false;
                }
            }
        }
        if (flag){
            count = -1;
        }
        System.out.print(count);
    }
}


//import java.util.Scanner;
//public class BuyApple{
//    public static void main(String []args){
//        Scanner s = new Scanner(System.in);
//        while(s.hasNext()){
//            int n = s.nextInt();
//            int count = n/6;
//            boolean flag = true;
//            int i,j;
//            for(i = 0;i <= n / 6;i++){
//                for(j = 0;j <= n / 8;j++){
//                    if(6 * i + 8 * j == n){
//                        count = Math.min(count,i + j);
//                        flag = false;
//                    }
//                }
//            }
//            if(flag){
//                count = -1;
//            }
//            System.out.print(count);
//        }
//    }
//}