package Important;
//字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”
//左旋转字符串
public class LeftRotateString {
    public String leftRotateString(String str,int n) {
        if (str.length() == 0){
            return str;
        }
        StringBuffer sb = new StringBuffer(str.substring(n,str.length()-1));
        for (int i = 0;i < n;i++){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
