package Solution;

public class MaxCandies {
     //M包糖果，抛M次硬币，硬币连续n次为正面，最多能得到多少颗糖果
     //candies int整型一维数组 每包糖果的数量
     //coin   int整型一维数组 抛硬币的结果
     //int整型 连续是正面的次数
     //int整型
    public static void main(String[] args) {
        int[] candies = {3, 5, 7, 2, 8, 8, 15, 3};
        int[] coin = {1, 0, 1, 0, 1, 0, 1, 0};
        int n = 0;
        maxCandies(candies, coin, n);
    }

    //糖果的数量1-20
    //糖果不超过100包
    public static int maxCandies(int[] candies, int[] coin, int n) {
        // write code here
        int a = 0;
        for (int i = 0;i < candies.length;i++){
            if (candies[i] >= 1 && candies[i] <= 20){
                a++;
            }
        }
            int count = 0;
            int temp = 0;
            int[] arr = new int[1];
            int j = 0;
            int s = 0;
        if (candies.length <= 100 && a == candies.length) {
            for (int i = 0; i <= candies.length - n; i++) {
                //求n个数的最大和
                count = 0;
                for (j = i; j < i + n; j++) {
                    count += candies[j];
                }
                //保存最大的和，并且将此时第一个下标存入arr[0]中
                if (count > temp) {
                    temp = count;
                    arr[0] = j - n;
                } else {
                    continue;
                }
            }
            //若coin为1，也要加上，但是从j开始的n个数不用再加

            for (int i = 0; i < coin.length; i++) {
                if (coin[i] == 0 && (i < arr[0] || i > arr[0] + n - 1)) {
                    s += candies[i];
                }
            }
            //System.out.println(s + count);

        }
        System.out.println(s + temp);
        return s + temp;
    }
}
