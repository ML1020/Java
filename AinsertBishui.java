package Solution;

import java.util.*;
 //B加到A中是否为回文数
public class AinsertBishui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String lineA = sc.nextLine();
//        String lineB = sc.nextLine();
        String lineA = "aa";
        String lineB = "a";
        StringBuffer sb = new StringBuffer(lineA);
        int count = 0;
        for(int i = 0;i < lineA.length()+1;i++){
            sb.insert(i,lineB);
            String s = sb.toString();
            String b = sb.reverse().toString();
            if (s.equals(b)){
                count++;
            }
            sb.reverse().delete(i,i+lineB.length());
            continue;
        }
        System.out.println(count);
    }

}
