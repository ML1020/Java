package Solution;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "abbbbca";
        validPalindrome(s);
    }

    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isValid(s, i + 1, j) || isValid(s, i, j - 1);
            }
        }
        return true;
    }

    public static boolean isValid(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
//    public static boolean validPalindrome(String s) {
//        StringBuffer sb = new StringBuffer(s);
//        StringBuffer sb1 = new StringBuffer(s);
////        如果sb进行翻转赋值给s1，那么sb也会被反转
//        String s1 = sb.reverse().toString();
//        if (s1.contains(s)) {
//            System.out.println("dui");
//            return true;
//        }
//        sb.reverse();
//        for (int i = 0; i < s.length(); i++) {
//            sb.deleteCharAt(i);
//            sb1.deleteCharAt(i);
//            s1 = sb.reverse().toString();
//            if (s1.contains(sb1)) {
//                System.out.println("dui");
//                return true;
//            } else {
//                if (i == s.length()-1){
//                    System.out.println("cuo");
//                    return false;
//                }
////                sb.setCharAt(i,s.charAt(i)); 这是替换
//                sb.reverse().insert(i,s.charAt(i));
//                sb1.insert(i,s.charAt(i));
//                continue;
//            }
//        }
//        return true;
//   }


