//给定两个有序整数数组 nums1 和 nums2，
//将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组.
package Solution;

import java.util.Arrays;

public class MergeTwoNum {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for(int i = m;i < nums1.length;i++){
            for (int j = i-m;j < n;){
                nums1[i] = nums2[j];
                break;
            }
        }
        Arrays.sort(nums1);
    }
}
