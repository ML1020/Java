package Solution;

public class ReverseSentence{
    public String everseSentence(String s) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        for (int i = s.length()-1;i>=0;i--){
            if (s.charAt(i) != ' '){
                sb1.append(s.charAt(i));
                if (i == 0){
                    sb.append(sb1.reverse());
                }
            }else if (s.charAt(i) == ' '){
                sb.append(sb1.reverse());
                sb.append(s.charAt(i));
                sb1.delete(0,sb1.length());
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
