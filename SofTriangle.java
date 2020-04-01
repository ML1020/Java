package Solution;

import java.util.Scanner;

public class SofTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int[] arr = new int[3];
        for (int i = 0;i < n;i++){
//            while(scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a+b>c && a+c>b && b+c>a){
                int x = (a+b+c)/2;
                double s = Math.sqrt(x*(x-a)*(x-b)*(x-c));
                System.out.println(s);
                System.out.println();
            }else {
                System.out.println("-1");
                System.out.println();
            }
        }
    }
}
