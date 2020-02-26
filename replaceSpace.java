package Important;

//将空格替换成另一个字符
public class replaceSpace {
    public static String replaceSpace(StringBuffer str) {
//            String sb1 = str.toString();
//            return sb1.replaceAll(" ","%20");
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < str.length();i++){
            if (str.charAt(i) == ' '){

                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1="hello everyone i love you";
        StringBuffer str = new StringBuffer(str1);
        replaceSpace(str);
    }
}
