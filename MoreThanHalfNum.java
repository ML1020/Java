package Important;

import java.util.*;

// 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
// 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
// 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0
public class MoreThanHalfNum {
    public static void main(String[] args) {

//        System.out.println("请输入几个数并用逗号隔开：");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next().toString();
//        String[] arr = str.split(",");
//        int[] b = new int[arr.length];
//        for (int j = 0; j < b.length; j++) {
//            b[j] = Integer.parseInt(arr[j]);
//        }
        int[] b = {};
        MoreThanHalfNum_Solution(b);
    }
    public static int MoreThanHalfNum_Solution(int[] array) {
        if (array.length == 0){
            System.out.println("0");
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int length = array.length%2==0?array.length/2:array.length/2+1;
        for (int i = 0;i < array.length;i++){
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }
//        for (int i = length-1;i < array.length;i++){
//            if (map.containsKey(array[i])){
//                if (map.get(array[i])+1 >= length){
//                    System.out.println(array[i]);
//                    return array[i];
//                }else {
//                    map.put(array[i],1);
//                }
//            }
//        }
        for (int i = 0;i < array.length;i++){
            if (map.get(array[i]) >= length){
                set.add(array[i]);
            }
        }
        if (!set.isEmpty()){
            Object[] r = set.toArray();
            System.out.println((int)r[0]);
            return (int)r[0];
        }else if (set.isEmpty()){
            System.out.println("0");
            return 0;
        }
        return 0;
    }
}

