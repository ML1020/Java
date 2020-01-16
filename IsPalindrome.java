package Solution;

public class IsPalindrome {
    public static void main(String[] args) {
        int x = 10;
        isPalindrome(x);
    }
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String s = String.valueOf(x);
        String s1 = null;
        StringBuffer sb = new StringBuffer(s);
        if (s.length() == 1) {
            return true;
        }
       s1 = sb.reverse().toString();
//        for (int i = s.length()-1; i >= 0; i--){
//            sb.append(s.charAt(i));
//        }
//        s1 = sb.toString();
        if (s.contains(s1)){
            return true;
        }
        return false;
    }
}
