package Solution;
//给定两个二进制字符串，返回他们的和（用二进制表示）。
//输入为非空字符串且只包含数字 1 和 0.
public class AddBinary {
    public String addBinary(String a, String b) {
//        int[] result = new int[Math.max(a.length(),b.length())+1];
//        char[] chars = new char[result.length];
//        char[] chars1 = new char[result.length];
//        int per = chars[a.length()-1]
//        for (int i = 0;i < result.length;i++){
//            for (int m = 0;m < Math.max(a.length(),b.length());m++){
//                for (int n = 0;n < Math.min(a.length(),b.length());n++){
//                    if (m == n){
//                        result[i] = (int)(a.charAt(i)) ^ (int)(b.charAt(i));
//
//                    }
//                }
//            }
//            //result[i] = (int)(a.charAt(i)) ^ (int)(b.charAt(i));
//        }
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;

        StringBuilder stb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;  // 进位
        while(i >= 0 || j >= 0) {
            if(i >= 0){ c += a.charAt(i --) - '0';}
            if(j >= 0) {c += b.charAt(j --) - '0';}
            stb.append(c % 2);
            c >>= 1;
        }

        String res = stb.reverse().toString();
        return c > 0 ? '1' + res : res;
    }
}
