package Demo;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("ccc");
        deque.offerFirst("bbb");
        deque.offerFirst("aaa");
        deque.offerLast("ddd");
        int n = deque.size();
        for (int i = 0;i < n;i++){
            System.out.println(deque.pollFirst());
        }
    }
}
