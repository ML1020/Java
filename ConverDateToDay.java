package Solution;

import java.util.Scanner;

//闰年的判断规则如下：
//        （1）若某个年份能被4整除但不能被100整除，则是闰年。
//        （2）若某个年份能被400整除，则也是闰年。
public class ConverDateToDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            int year = scanner.nextInt();
//            int mouth = scanner.nextInt();
//            int data = scanner.nextInt();
            int year = 2012;
            int mouth = 12;
            int data = 31;
            int outday = 0;int out = 0;
            int[] r = {31,29,31,30,31,30,31,31,30,31,30,31};
            int[] fr = {31,28,31,30,31,30,31,31,30,31,30,31};
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                for (int i = 0;i < mouth-1;i++){
                    out += r[i];
                }
                outday = out+data;
                System.out.println(outday);
            }else{
                for (int i = 0;i < mouth-1;i++){
                    out += fr[i];
                }
                outday = out+data;
                System.out.println(outday);
            }
        }
    }
//}
