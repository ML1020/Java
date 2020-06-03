package Solution;

import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        String s = "()()(((())))";
        chkParenthesis(s,12);
    }
    public static boolean chkParenthesis(String A, int n) {
        if (n % 2 != 0){
            System.out.println("cuo");
            return false;
        }
        Stack<Character> stack = new Stack<>();
        if (A.charAt(0) == '(' || A.charAt(0) == ')') {
            stack.add(A.charAt(0));
        }else {
            return false;
        }
        for (int i = 1;i < n;i++){
            if (A.charAt(i) != '(' && A.charAt(i) != ')'){
                System.out.println("cuo");
                return false;
            }
            if (A.charAt(i) == '(' && stack.peek() == ')'){
                stack.pop();
                if (i != n-1){
                stack.add(A.charAt(i+1));
                i++;
                continue;}
            }
//            System.out.println(stack.peek());
            if (A.charAt(i) == ')' && stack.peek() == '('){
                stack.pop();
                if (stack.isEmpty()) {
                    if (i != n - 1) {
                        stack.add(A.charAt(i + 1));
                        i++;
                        continue;
                    }
                }
                continue;
            }
            stack.add(A.charAt(i));
        }
        if (stack.empty()){
            System.out.println("dui");
            return true;
        }else if (!stack.empty()){
            System.out.println("cuo");
            return false;
        }
        return true;
    }
}
