package Solution;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FindBigNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split(" ") ;
        int[] arr = new int[strings.length];
//        int[] arr = {3,2,3};
        for (int i = 0;i <strings.length;i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < arr.length;i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        Set<Integer> set = map.keySet();
        for (Integer i:set){
//            System.out.println(i);
            if (map.get(i) > arr.length/2){
                System.out.print(i);
            }
            continue;
        }
    }
}
