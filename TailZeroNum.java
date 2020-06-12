package Solution;

import java.util.Scanner;

public class TailZeroNum {
    //内存不够
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long r = 1;
//        for(int i = n;i > 0;i--){
//            r = r*i;
//        }
//        System.out.println(r);
//        int count = 0;
//        for(long i = r;r > 9;){
//            if(r % 10 == 0){
//                count++;
//                r = r/10;
//            }else{
//                break;
//            }
//        }
//        System.out.print(count);
//    }

    //一个数字包含几个5，就会有几个零(双数乘以5才能有零)
    //比如，125/5 = 25，25/5 = 5，5/5=1；则有三个零
    //再到120，120/5 = 24；则有一个零
    //一直循环到5，有一个零
    //所有的零加起来 就是末尾的零(125有31个0)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        for (int i = n; i >= 5; i--) {
            int t = i;
            while (t % 5 == 0) {
                r++;
                t /= 5;
            }
        }
        System.out.println(r);
    }
}
