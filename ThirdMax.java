package Solution;
//给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。
// 要求算法时间复杂度必须是O(n)。
//sort(复杂度O(nlgn))不能用

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        //1.数组中数字不同
        //Arrays.sort(nums);
//        if(nums.length<3){
//            return nums[nums.length - 1];
//        }
//        return nums[nums.length-3];
        //2.都适用的情况


        Set<Integer> set = new HashSet<>();
        for (Integer integer:nums){
            set.add(integer);
        }
        Object[] newint = set.toArray();
        Arrays.sort((newint));
        if (newint.length < 3) {
            return (int)newint[newint.length-1];
        }
        return (int)newint[newint.length-3];
    }
}
