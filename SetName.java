package Solution;

import java.util.Scanner;

public class SetName {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
            StringBuffer sb = new StringBuffer();
//            String s = scanner.nextLine();
        String s = "hello_world";
        for (int i = 0;i < s.length();i++){
                if (s.charAt(i) == '_'){
                    sb.append((s.charAt(i+1)+"").toUpperCase());
                    i++;
                }else {
                sb.append(s.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
//    }
}
