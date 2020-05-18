package Solution;
//找出最长的无重复字符字串，返回长度
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "qrsvbspk";
        lengthOfLongestSubstring(s);
    }
    public static int lengthOfLongestSubstring(String s) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer r = new StringBuffer();
        int n = 0;
        System.out.println(s.length());
        if (s.length() == 1){
            System.out.println("1");
            return 1;
        }
        for (int j = 0; j < s.length();j++){
            for (int i = j; i < s.length();i++){
                if (!s1.toString().contains(s.charAt(i)+"")){
                    s1.append(s.charAt(i));
                }else{
                    if (s1.length() > r.length()){
                        r = s1;
                        s1 = new StringBuffer();
                        break;
                    }else {
                        s1 = new StringBuffer();
                        break;
//                        continue;
                    }
                }
            }
        }
        System.out.println(r.toString());
        return r.length();
    }
}
