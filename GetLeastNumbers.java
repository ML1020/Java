package Solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int l = input.length;
        if (k > l || k==0){
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0;i < l;i++){
            if (maxHeap.size() != k){
                maxHeap.offer(input[i]);
            }else if (maxHeap.peek() > input[i]){
                Integer t = maxHeap.poll();
                t = null;
                maxHeap.offer(input[i]);
            }
        }
        for (Integer integer : maxHeap){
            result.add(integer);
        }
        return result;
    }
}
