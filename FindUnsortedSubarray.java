package Solution;

public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0, r = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max) {
                r = i;
            } else {
                max = nums[i];
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > min) {
                l = i;
            } else {
                min = nums[i];
            }
        }
        return r == 0 ? 0 : r - l + 1;
    }
}
