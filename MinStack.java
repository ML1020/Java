import java.util.Stack;

public class MinStack {
    //寻找栈中最小的元素
    Stack<Integer> normal = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack(){}
    public void push(int x){
        normal.push(x);
        if (min.empty()){
            min.push(x);
        }else{
            int m = min.peek();
            if (x <= m){
                min.push(x);
            }else{
                min.push(m);
            }
        }
    }
    public void pop(){
        normal.pop();
        min.pop();
    }
    public int top(){
        return normal.peek();
    }
    public int getMin(){
        return min.peek();
    }
}
