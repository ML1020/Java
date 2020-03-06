package Solution;

import java.util.Scanner;

public class BrokenKeyBroad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
//        String s1 = "7_This_is_a_test";
//        String s2 = "_hs_s_a_es";
        brokenKeyBroad(s1,s2);
    }

    private static String brokenKeyBroad(String s1, String s2) {
        StringBuffer sb = new StringBuffer();
        int t = 0;
//        for (int i = 0;i < s1.length();i++){
//            for (int j = t;j < s2.length();j++){
//                if (s1.charAt(i) == s2.charAt(j)){
//                    t++;
//                    break;
//                }else if (s1.charAt(i) != s2.charAt(j)){
//                    sb.append(s1.charAt(i));
//                    break;
//                }
//            }
//        }
        for (int i = 0,j = 0;i < s1.length();i++){
                if (s1.charAt(i) == s2.charAt(j) && j < s2.length()-1){
                    j++;
                }else if (s1.charAt(i) != s2.charAt(j)){
                    sb.append(s1.charAt(i));
                }
        }
        String r = sb.toString().toUpperCase();
        char[] chars = r.toCharArray();
        String result = "";
        for (int i = 0;i < r.length();i++){
            if (!result.contains(chars[i]+"")){
                result += (chars[i]+"");
            }
        }
        System.out.println(result);
        return result;
    }
}
