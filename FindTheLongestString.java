package Solution;
import java.util.*;

//读入一个字符串str，输出字符串str中的连续最长的数字串
public class FindTheLongestString {
    public static void main(String[] arg) {
//            Scanner sc = new Scanner(System.in);
//            String s = sc.nextLine();
        String s = "abcd12345ed125ss1234 5678";
        StringBuffer sb = new StringBuffer();
        String s1 = new String();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && i != s.length()-1) {
                sb.append(s.charAt(i));
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && i == s.length()-1) {
                sb.append(s.charAt(i));
                if (sb.length() > s1.length()) {
                    s1 = sb.toString();
                    System.out.println(s1);
                    break;
                }
                System.out.println(s1);
            }if (s.charAt(i) <= '0' || s.charAt(i) >= '9'){
                if (sb.length() > s1.length()) {
                    s1 = sb.toString();
                    if (i == s.length() - 1) {
                        System.out.println(s1);
                    } else {
                        sb.delete(0, sb.length());
                        continue;
                    }
                }
                sb.delete(0, sb.length());
                continue;
            }
        }
    }
}
