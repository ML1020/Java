package Solution;
//import java.util.*;
//public class JumpSqu {
//   public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (i <= 2) {
//                list.add(i);
//            } else {
//                list.add(list.get(i - 3) + list.get(i - 2));
//            }
//        }
//        System.out.println(list.get(list.size() - 1));
//    }
//}

/*
动态规划：dp[i]表示跳上i格的所有方法数
其中dp[i] = dp[i-1]+dp[i-2];
*/
        import java.util.Scanner;
public class JumpSqu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 1;dp[1] = 1;
        for(int i =2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}