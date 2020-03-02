package Solution;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindErrorFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (scanner.hasNext()) {
            String s = scanner.next();
            int line = scanner.nextInt();
            String[] arr = s.split("\\\\");
            String string = arr[arr.length - 1];
            if (string.length() > 16) {
                string = string.substring(string.length() - 16);
            }
            String key = string + " " + line;
            int value = 1;
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, value);
            }
        }
        int count = 0;
        for (String s1 : map.keySet()) {
            count++;
            if (count > (map.keySet().size() - 8)) {
                System.out.println(s1+" "+map.get(s1));
            }
        }
    }
}
