package Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindNumLengthpassTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] r = new int[str.length];
        for (int i = 0; i < r.length; i++) {
            r[i] = Integer.parseInt(str[i]);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < r.length; j++) {
            if (map.containsKey(r[j])) {
                map.put(r[j], map.get(r[j]) + 1);
            } else {
                map.put(r[j], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= r.length / 2) {
                System.out.println(entry.getKey());
            }
        }
    }
}
