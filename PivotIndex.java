package Solution;
//给定一个整数类型的数组 nums ，请编写一个能够返回数组“中心索引”的方法。
//我们是这样定义数组中心索引的：
//数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
//如果数组不存在中心索引，那么我们应该返回 -1。
//如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个
public class PivotIndex {
    public int pivotIndex(int[] nums){
        //sumLeft + sumRight + nums[p] = sumTotal;
        //sumLeft = sumRight
        //可以得出 sumLeft * 2 + nums[p] = sumTotal
        int total = 0;
        int leftsum = 0;
        for (int j = 0;j < nums.length;j++){
            total += nums[j];
        }
        for (int i = 0;i < nums.length;i++){
            if (leftsum*2+nums[i] == total){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
//    public static int pivotIndex(int[] nums) {
//        //自己写得不好，只适用于初始值不同的情况
//        if (nums.length < 3){
//            System.out.println("-1");
//            return -1;
//        }
//        int left = nums[0];int right = nums[nums.length-1];
//        for (int i = 1,j = nums.length - 2;i <= j;){
//            if (left<right){
//                left += nums[i];
//                i++;
//            }else if (left>right){
//                right += nums[j];
//                j--;
//            }else if (left == right){
//                if (i==j) {
//                    System.out.println(i);
//                    return i;
//                }
//            }else {
//                System.out.println("-1");
//                return -1;
//            }
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        int[] nums = {1, 7, 3, 6, 5, 6};
//        pivotIndex(nums);
//    }
}
