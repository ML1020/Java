package Solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindLongest58 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
        String s = "1234567890477485158";
        StringBuffer sb = new StringBuffer();
        StringBuffer r = new StringBuffer();
        String s1 = new String();
//        Set<ArrayList<String>> lists = new HashSet<>();
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        int max = 0;
        for (int i = 0;i < s.length();i++){
            if (s.charAt(i) > '4' && s.charAt(i) < '9'){
                sb.append(s.charAt(i));
            }else if (sb.length() > 0){
                list.add(sb.toString());
                    if (!s1.contains(sb) && list.size() > max){
                        String s2 = sb.toString();
                        r.append(s2);
                        max = sb.length();
                        sb.delete(0,sb.length());
                }
                sb.delete(0,sb.length());
            }
        }
        System.out.println(r.toString());
    }
}
