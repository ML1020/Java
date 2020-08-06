package Important;

import java.util.*;

//题目描述
//小明在越南旅游，参加了当地的娱乐活动。
// 小明运气很好，拿到了大奖， 到了最后的拿奖金环节。
// 小明发现桌子上放着一列红包，每个红包上写着奖金数额。
//现在主持人给要求小明在这一列红包之间“切”2刀，将这一列红包“切”成3组，
// 并且第一组的奖金之和等于最后一组奖金和（允许任意一组的红包集合是空）。
// 最终第一组红包的奖金之和就是小明能拿到的总奖金。
// 小明想知道最多能拿到的奖金是多少，你能帮他算算吗。
//
//举例解释：桌子上放了红包  1, 2, 3, 4, 7, 10。小明在“4,7”之间、
// “7,10” 之间各切一刀，将红包分成3组 [1, 2, 3, 4]   [7]   [10]，
// 其中第一组奖金之和=第三组奖金之和=10，所以小明可以拿到10越南盾。

//输入4 1 2
//输出0
//说明
//  [ ]  [4, 1, 2] [ ] ，小明没办法，为了保证第一组第三组相等，
//只能都分成空的。所以小明只能拿到0越南盾。
public class MaxMoney {
    //思路：
    //1.定义左指针跟右指针，分别指向第一个红包和最后一个红包
    //2.左指针指向数据和 > 右指针指向数据和，左指针++；
    //3.左指针指向数据和 < 右指针指向数据和，右指针--；
    //4.左指针指向数据和 = 右指针指向数据和，左指针++，右指针--；
    //约束条件是左指针 < 右指针。
    //需要注意的是所有求和的值都要设为long型，会超过int最大范围。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//红包个数
        int[] d = new int[n];//每个红包奖金数额
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int left = 0;
        long leftSum = d[left];
        int right = n - 1;
        long rightSum = d[right];
        long max = 0;
        while (left < right) {
            if (leftSum < rightSum) {
                left++;
                leftSum += d[left];
            }
            if (leftSum > rightSum) {
                right--;
                rightSum += d[right];
            }
            if (leftSum == rightSum) {
                max = leftSum;
                left++;
                right--;
                leftSum += d[left];
                rightSum += d[right];
            }
        }
        System.out.println(max);
    }
}
