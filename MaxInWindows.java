package Important;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 题目：滑动窗口的最大值
 * 思路：滑动窗口应当是队列，但为了得到滑动窗口的最大值，
 * 队列序可以从两端删除元素，因此使用双端队列。
 *     原则：
 *     对新来的元素k，将其与双端队列中的元素相比较
 *     1）前面比k小的，直接移出队列（因为不再可能成为后面滑动窗口的最大值了!）,
 *     2）前面比k大的X，比较两者下标，判断X是否已不在窗口之内，不在了，直接移出队列
 *     队列的第一个元素是滑动窗口中的最大值
 */

public class MaxInWindows {
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        if (num == null) {
            return ret;
        }
        if (num.length < size || size < 1) {
            return ret;
        }

        LinkedList<Integer> indexDeque = new LinkedList<>();
        for (int i = 0; i < size - 1; i++) {
            //队列不为空，并且num[i] > num[indexDeque.getLast()]，移除队列中的最后一个元素
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]) {
                int b = indexDeque.getLast();
                indexDeque.removeLast();
            }
            indexDeque.addLast(i);
        }

        for (int i = size - 1; i < num.length; i++) {
            //队列不为空 并且 num[i] > num[indexDeque.getLast()]
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]) {
                indexDeque.removeLast();
            }
            //否则将i加入队列末尾
            indexDeque.addLast(i);
            if (i - indexDeque.getFirst() + 1 > size) {
                indexDeque.removeFirst();
            }
            ret.add(num[indexDeque.getFirst()]);
        }
        return ret;
    }

    public static void main(String[] args) {
//        int[] num = {1,2,3,4,5,6,7};
        int[] num = {2,4,3,5,7,6,1};
        int size = 3;
        System.out.println(maxInWindows(num,size));
    }
}
