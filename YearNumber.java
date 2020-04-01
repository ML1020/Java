package Solution;

import java.util.Scanner;

public class YearNumber {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        String s = "2020东京奥运会";
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        for (int i = 0;i < chars.length;i++){
            if (chars[i] >= '0' && chars[i] <= '9'){
                sb.append(chars[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
