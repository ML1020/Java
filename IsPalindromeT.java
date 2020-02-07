package Solution;

public class IsPalindromeT {
    public static void main(String[] args) {
        String s = "0P";
        isPalindrome(s);
    }
    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            System.out.println("f");
            return false;
        }
        if (s.length() == 1) {
            System.out.println("t");
            return true;
        } else if (s.length()>=2){
            s = s.toLowerCase();
            StringBuffer sb = new StringBuffer();
            StringBuffer s1 = new StringBuffer();

        //    s1 = sb.reverse().toString();
        for (char c:s.toCharArray()){
            if ((c >= '0' && c <= '9') || (c>='a' && c <= 'z')){
                sb.append(c);
            }
        }
        //sb.reverse();
        for (int i = s.length()-1;i>=0;i--){
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i)>='a' && s.charAt(i) <= 'z')){
                s1.append(s.charAt(i));
            }
        }

        if (sb.toString().contains(s1.toString())) {
            System.out.println("t");
            return true;
        }
            System.out.println("f");
            return false;
        }
        System.out.println("t");
        return true;
    }
}
