package Solution;

import java.util.Scanner;

public class Drink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0 || n < 1 || n>100){break;}
            int x = n / 3;   //兑换后的空瓶子数量,喝的瓶数 3 + 1
            int y = n % 3;   //兑换之前的空瓶子数量 1 1
            int p = x;  //喝的总数量  3+1
            while (x > 0){
                int t1 = x;
                int t2 = y;
                x = (t1 + t2) /3;    //喝的数量
                y = (t1 + t2) % 3;   //所有空瓶数量
                p += x;
            }
            if (x == 0 && y == 2){
                p++;
            }
            System.out.println(p);
        }
        sc.close();
    }
}