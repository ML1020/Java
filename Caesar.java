package Solution;

import java.util.*;

public class Caesar {
    public static void main(String[] args) {
        System.out.println("输入的字符串");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
//        String string = "ABCDEFG";
        caesarJiaMi(string);
        caesarJieMi(string);
    }

    private static void caesarJiaMi(String string) {
        String s2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        // String s1 = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = s2.toCharArray();
        char[] charsjie = string.toCharArray();
        int n = 0;
        for (int i = 0;i < charsjie.length;i++){
            for (int j = 0;j < chars.length;j++){
                if (charsjie[i] == chars[j]){
                    n = (j+3)%26;
                    sb.append(chars[n]);
                }
            }
        }
        System.out.println("加密结果："+sb.toString());
    }

    private static void caesarJieMi(String string) {
        String s2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        // String s1 = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = s2.toCharArray();
        char[] charsjie = string.toCharArray();
        int n = 0;
        for (int i = 0;i < charsjie.length;i++){
            for (int j = 0;j < chars.length;j++){
                if (charsjie[i] == chars[j]){
                    if (j <= 2){
                        n = j+26-3;
                        sb.append(chars[n]);
                        break;
                    }else if (j > 2){
                        n = (j+26)%26-3;
                        sb.append(chars[n]);
                        break;
                    }
                }
            }
        }
        System.out.println("解密结果："+sb.toString());
    }
}
