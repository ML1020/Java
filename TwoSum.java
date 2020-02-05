package Solution;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int temp = 0;
        int[] result = new int[2];
        for(int i = 0;i < nums.length;i++){
            for (int j = 0;j < nums.length;j++){
                if (j!=i){
                    temp = nums[i] + nums[j];
                    if (temp == target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
