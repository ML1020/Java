package Solution;

import java.util.Scanner;

//A删除与B相同的字符
public class DeleteContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String A = scanner.nextLine();
//        String B = scanner.nextLine();
        String A = "They are students.";
        String B = "aeiou";
        int count = 0;
        //Thy r stdnts.
        for (int i = 0; i < B.length(); i++) {
            A = A.replaceAll(B.substring(i, i + 1), "");
        }
        System.out.println(A);
    }
}
