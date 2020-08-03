package Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetNumRatherPassArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){

                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                System.out.println(entry.getKey());
            }
        }
    }
}