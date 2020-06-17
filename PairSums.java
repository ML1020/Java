package Solution;

import java.util.*;

public class PairSums {
    //双指针
    public List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            //如果相等则存在res中
            if (sum == target) {
                //asList的返回对象是一个Arrays内部类,并没有实现集合的修改方法。
                // Arrays.asList体现的是适配器模式，只是转换接口，后台的数据仍是数组。
                res.add(Arrays.asList(nums[left], nums[right]));
                left++;
                right--;
            } else if (sum > target)
                //和大说明右指针要往右移
                right--;
            else
                left++;
        }
        return res;
    }

    //hashmap
    public static List<List<Integer>> pairSums2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(target - num) && map.get(target - num) > 0) {
                res.add(Arrays.asList(target - num, num));
                //将此数字key的次数  -1
                map.put(target - num, map.get(target - num) - 1);
            } else
                //Map.getOrDefault(Object key, V defaultValue)方法的作用是：
                //  当Map集合中有这个key时，就使用这个key值所对应的value值；
                //  如果没有就使用默认值defaultValue。
                map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(res);
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {5,6,5,6,5};
        int target = 11;
        pairSums2(nums,target);
    }

    //asList();方法的分析
//        int[] data = {1,2,3,4,5};
//        List list = Arrays.asList(data);
//        System.out.println(list.get(0).getClass());
//        System.out.println(data.equals(list.get(0)));  //true
//        System.out.println("列表中的元素数量是：" + list.size());   //1

//        Integer[] data = {1,2,3,4,5};
//        List list = Arrays.asList(data);
//        System.out.println(list.get(0).getClass());
//        System.out.println(data.equals(list.get(0)));   //false
//        System.out.println("列表中的元素数量是：" + list.size());   //5

//        String[] str = new String[]{"1","2"};
//        List list = Arrays.asList(str);
//        System.out.println(list.size());   //2

//        char[] chars = {'a','b','c'};
//        List list = Arrays.asList(chars);
//        System.out.println(list.size());    //1
//    }
}
