package Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FindCharNumber {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> map = new TreeMap<>();
//        Map<Character,Integer> map = new HashMap<>();
//        while (scanner.hasNext()) {
//            String s = scanner.nextLine();
            String s = "DFJEIWFNQLEF0395823048+_+JDLSFJDLSJFKK";
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c >= 'A' && c <= 'Z') {
                    if (!map.containsKey(c)) {
                        map.put(c, 1);
                    } else if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    }
                }
            }
            //     System.out.println(map);
            for (char ch = 'A'; ch <= 'Z'; ch++) {
//                if (!map.containsKey(ch)){
//                    System.out.println(ch + ":" + 0);
//                }
                System.out.println(ch + ":" + ((map.get(ch) != null) ? map.get(ch) : 0));
            }
//        }

    }
}
