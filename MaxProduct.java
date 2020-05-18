package Solution;
//给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组
// （该子数组中至少包含一个数字），并返回该子数组所对应的乘积
public class MaxProduct {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        maxProduct(nums);
    }
    public static int maxProduct(int[] nums) {
        int result = 0;
        int maxr = 1;
        int minr = 1;
        if (nums.length == 1) {
            return nums[0];
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    int temp = minr;
                    minr = maxr;
                    maxr = temp;
                }
                maxr = Math.max(maxr * nums[i], nums[i]);
                minr = Math.min(minr * nums[i], nums[i]);
                result = Math.max(maxr, result);
            }
            return result;
        }
    }
}
