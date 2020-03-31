package Important;

import java.util.*;

public class FindNumsAppearOnce {
    public static void main(String[] args) {
        int[] array = {2,4,3,6,3,2,5,5,2,3};
        int[] num1 = {0};
        int[] num2 = {0};
        findNumsAppearOnce(array,num1,num2);
    }
//    1.一个整型数组里除了两个数字之外，其他的数字都出现了两次。
//    请写程序找出这两个只出现一次的数字。
//    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
//        Map<Integer,Integer> map = new HashMap<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0;i<array.length;i++){
//            if(map.containsKey(array[i])){
//                map.put(array[i],2);
//            } else{
//                map.put(array[i],1);
//            }
//        }
//        for(int j = 0;j < array.length;j++){
//            if(map.get(array[j]) == 1){
//                list.add(array[j]);
//            }
//        }
//        num1[0] = list.get(0);
//        num2[0] = list.get(1);
//        System.out.print(num1[0]);
//        System.out.print(num2[0]);
//    }


    //    2.一个整型数组中，写程序找出出现n次的数字。
    public static void findNumsAppearOnce(int [] array,int num1[] , int num2[]){
//        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
//        int n = 1;
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            } else{
                map.put(array[i],1);
            }
        }
        for (int j = 0;j < array.length;j++){
            if (map.get(array[j]) == 3){
                set.add(array[j]);
            }
        }
        Object[] temp = set.toArray();
        num1[0] = (int) temp[0];
        num2[0] = (int) temp[1];

//        num1[0] = list.get(0);
//        num2[0] = list.get(1);
        System.out.println(num1[0]);
        System.out.print(num2[0]);
    }
}
