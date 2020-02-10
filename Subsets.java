package Solution;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subsets(nums);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        //建立一个存放最终结果的链表results
        List<List<Integer>> results = new ArrayList<>();
        //先将空集放入其中
        results.add(new ArrayList<>());
        //开始循环，将下一个数一次存放在上一个数的子集中，形成新的子集
        for(int i = 0; i < nums.length; i++) {
            //建立一个存放当前数字子集的临时链表
            List<List<Integer>> plusNumbers = new ArrayList<>();
            //result为results的第二维链表
            for(List<Integer> result : results) {
                //新建链表存放新形成的某一组合，以result为基础(包含当前result中的元素)
                List<Integer> newNumber = new ArrayList<>(result);
                //将下一个元素放入当前组合中
                //如果result为空、i为0，则newNumber为[1]
                newNumber.add(nums[i]);
                //将集合一次放入临时链表中
                plusNumbers.add(newNumber);
            }
            //将当前的临时链表plusNumbers中，所有集合放入results
            results.addAll(plusNumbers);
        }
        return results;
    }
}
