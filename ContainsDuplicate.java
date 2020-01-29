//给定一个整数数组，判断是否存在重复元素。
//如果任何值在数组中出现至少两次，函数返回 true。
//如果数组中每个元素都不相同，则返回 false。
package Solution;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int[] sum = new int[10];
        for (int i = 0;i < nums.length;i++){
            sum[nums[i]]++;
        }
        for (int j = 0;j < 10;j++){
            if (sum[j] > 1){
                return true;
            }
            continue;
        }
        return false;
    }

//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> res = new HashSet<>();
//        for(int i : nums){
//            res.add(i);
//        }
//        if(res.size() < nums.length){
//            return true;
//        }
//        return false;
//    }
}
