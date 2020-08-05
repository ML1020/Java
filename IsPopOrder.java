package Important;

import java.util.*;

//栈的压入、弹出序列

//输入两个整数序列，第一个序列表示栈的压入顺序，
// 请判断第二个序列是否可能为该栈的弹出顺序。
// 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
// 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
// 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
// （注意：这两个序列的长度是相等的）
public class IsPopOrder {
    public static void main(String[] args) {
        int[] push = {1,2,3,4,5};
//        int[] pop = {4,5,3,2,1 };
        int[] pop = {4,3,5,1,2};
        IsPopOrder(push,pop);
    }
// 压栈 pushA, 弹栈 popA
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        //如果长度为零则返回false
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        //new 一个新的栈
        Stack<Integer> stack = new Stack<Integer>();
        int j = 0;

        //1,2,3,4,5 push
        //4,5,3,2,1  对应的pop
        //错误的弹栈顺序：4,3,5,1,2
        for (int i = 0; i < popA.length; i++) {
            stack.push(pushA[i]);
            /* peek()方法 查看栈顶对象而不移除它*/
            //栈顶对象是否=弹出序列？是则pop出栈
            //栈顶元素  与  数组中取出的顺序相同  则弹栈。栈为空则顺序正确
            while (j < popA.length && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }

        }
        //栈为空则正确
        if (stack.empty()) {
            System.out.println("对");
        }else {
            System.out.println("cuo");
        }
        return stack.empty() == true;
    }
}