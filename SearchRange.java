package Solution;
//给定一个按照升序排列的整数数组 nums ，和一个目标值 target 。
// 找出给定目标值在数组中的开始位置和结束位置。
// 你的算法时间复杂度必须是  O(log n) 级别。
// 如果数组中不存在目标值，返回  [-1, -1] .
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length == 0){
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        if (nums.length == 1){
            if (target == nums[0]){
                result[0] = 0;
                result[1] = 0;
                return result;
            }else if (target != nums[0]){
                result[0] = -1;
                result[1] = -1;
                return result;
            }
        }
        for (int i = 0;i < nums.length;i++){
            if (nums[i] == target){
                result[0] = i;
                break;
            }
            result[0] = -1;
        }
        for (int j = nums.length-1;j>=0;j--){
            if (nums[j] == target){
                result[1] = j;
                break;
            }
            result[1] = -1;
        }
        return result;
    }
}
