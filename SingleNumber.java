package Solution;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
//    遍历数组并挨个将元素丢进集合，如果集合中存在这个元素，则将它remove掉，
//    如果不存在则add。按题目的意思，
//    最后这个集合中就只有这个只出现一次的元素了
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0;i < nums.length;i++){
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else {set.add(nums[i]);}
        }
        int result = 0;
        for (int i = 0;i<nums.length;i++){
            if (set.contains(nums[i]));
            result = nums[i];
        }
        return result;
    }
}