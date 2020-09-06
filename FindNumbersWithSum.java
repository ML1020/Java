package Solution;

import java.util.ArrayList;
import java.util.HashMap;

public class FindNumbersWithSum{
    //暴力解法
    public ArrayList<Integer> findNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> sum_2=new ArrayList<Integer>();
        HashMap<Integer,ArrayList<Integer>> two=new HashMap<>();
        if (array==null) {//限制为空的情况
            return null;
        }
        if (array.length==0||sum==0) {//这个是特殊的案例
            return sum_2;
        }
        if (array[0]>sum||array.length==1) {//这个是当不够两个时候，也是无意义
            return null;
        }
        int i=0;
        int j=0;
        int sum_temp=0;
        while (i<array.length&&array[i]<sum) {
            j=i+1;
            while (j<array.length&&array[j]<sum) {
                ArrayList<Integer> list=new ArrayList<Integer>();
                if (array[i]+array[j]==sum) {
                    sum_temp=array[i]*array[j];//他们的积
                    list.add(array[i]);
                    list.add(array[j]);
                    two.put(sum_temp,list);
                }

                j++;
            }
            i++;
        }
        int small=sum*sum;
        ArrayList<Integer> list2=new ArrayList<>();
        for(Integer num:two.keySet()) {//求出最小值
            if (num<small) {
                small=num;
                list2=two.get(num);
            }
        }
        return list2;
    }
}
//public class FindNumbersWithSum {
//    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        // 先判断特殊情况：数字少于两个时
//        if (array.length < 2 || array == null) {
//            return list;
//        }
//        // 获取数组的长度
//        int len = array.length;
//        int start = 0;
//        int end = len - 1;
//        while (start < end && start < len - 1 && end > 0) {
//            if (array[start] + array[end] == sum) {
//                list.add(array[start]);
//                list.add(array[end]);
//                return list;
//
//            }
//            if (array[start] + array[end] > sum) {
//                end--;
//            }
//            if (array[start] + array[end] < sum) {
//                start++;
//            }
//        }
//        return list;
//    }
//}