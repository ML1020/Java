package Solution;

import java.util.Scanner;
import java.util.Stack;

public class BalancedKuoHao {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
        String s = "(()))";
        String[] strings = s.split("");
        Stack<String> stack = new Stack<>();
        int count = 0;
        int r = 0;
        for (int i = 0;i < strings.length;i++){
            if (strings[i].contains('('+"")){
                stack.add(strings[i]);
                r++;
            }else if (strings[i].contains(')'+"") && count == 0 && !stack.isEmpty()){
                stack.add(strings[i]);
                count++;
            }else if (strings[i].contains(')'+"") && count == 1){
                stack.pop();
                stack.pop();
                count = 0;
                r--;
            }
        }
        if (count == 0) {
            System.out.println(r * 2);
        }else if (count == 1){
            System.out.println(r);
        }


        System.out.println(Math.pow((-2),2));
    }
}
