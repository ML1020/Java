package Important;

import java.util.Stack;

//括号匹配问题
//将左括号先放入栈中，若符号为右括号，则将栈的第一个栈顶元素与之匹配，不匹配返回false
//匹配将栈顶元素取出。若最终栈为空并且没有右括号，则匹配成功
//例题：输入样例
//[>
//([]{<>})
//({[<>]})
//()
//()
//()
//输出样例
//no
//yes
//yes
//yes
//yes
//yes
public class IsValid {
    public static void main(String[] args) {
        String s = "(){{[]}}";
        System.out.println();
        isValid(s);
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        Boolean flag = true;
        for (int i = 0;i < c.length;i++){
            if (c[i] == '{' || c[i] == '[' || c[i] == '('){
                stack.push(c[i]);
            }
            else {
                char left = stack.pop();
                //如果栈顶元素为空则说明多一个右括号
                if (left == ' '){
                    flag = false;
//                    return false;
                }
                if (left == '(' && c[i] == ')'){
                    flag = true;
//                    return true;
                }
                if (left == '{' && c[i] == '}'){
                    flag = true;
//                    return true;
                }
                if (left == '{' && c[i] == '}'){
                    flag = true;
//                    return true;
                }
            }
        }

        if (flag){
            //匹配完成后，栈不为空，则说明有多余左括号
            if (!stack.isEmpty()){
                System.out.println("false");
                return false;
            } else {
                System.out.println("true");
            }
        }else {
            System.out.println("false");
        }
        return true;
    }
}
