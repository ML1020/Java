package Solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//字符串中每个字符出现的次数
public class TheWordsAppear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
        String s = "AAAABBBBCCC";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0;i < s.length();i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        Set<Character> set = map.keySet();
        for (Character i : set){
            System.out.print(i + "=" +map.get(i)+" ");
        }
    }
}
