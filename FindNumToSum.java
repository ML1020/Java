import java.util.Scanner;

//给定一个有n个正整数的数组A和一个整数sum，
//求选择数组A中部分数字和为sum的方案数
//当两种选取方案有一个数字的下标不一样，
//我们就认为是不同的组成方案，采用动态规划算法
//dp[i][j]       代表用前i个数字凑到j的最多方案
//dp[i][j] = dp[i-1][j]   不用第i个数字凑到j的最多方案
//dp[i][j] += dp[i-1][j-value[i]]  用第i个数字，
//只需要看原来凑到j-value[i]的最多方案，并累加
//dp[0] = 1     初始化，表示凑到0永远有1种方案
public class FindNumToSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //数组长度为n表示n个数字
        int sum = scanner.nextInt();  //部分元素求和sum
        int[] value = new int[n];  //初始化数组
        long[] dp = new long[sum + 1];  //动态规划数组
        dp[0] = 1;  //index=0的初始化值
        for (int i = 0;i < n;i++){
            value[i] = scanner.nextInt();
            for (int j = sum;j >= 0;j--){
                if (j >= value[i]){
                    dp[j] += dp[j - value[i]];
                }
            }
        }
        System.out.println(dp[sum]);
    }
}
