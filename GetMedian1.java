package Important;

//数据流中的中位数
//如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
// 那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
// 那么中位数就是所有数值排序之后中间两个数的平均值。
// 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
import java.util.LinkedList;

public class GetMedian {
//    static LinkedList<Integer> list = new LinkedList<Integer>();
//    //读取数据流
//    public static void Insert(Integer num) {
//        if (list.size()==0||num < list.getFirst()) {
//            list.addFirst(num);
//        } else {
//            boolean insertFlag = false;
//            for (Integer e : list) {
//                if (num < e) {
//                    int index = list.indexOf(e);
//                    list.add(index, num);
//                    insertFlag = true;
//                    break;
//                }
//            }
//            if (!insertFlag) {
//                list.addLast(num);
//            }
//        }
//    }
//
//    //获得中位数
//    public static Double getMedian() {
//        if (list.size() == 0) {
//            return null;
//        }
//        //偶数个，中位数为中间两个数的和/2
//        if (list.size() % 2 == 0) {
//            int i = list.size() / 2;
//            Double a = Double.valueOf(list.get(i - 1) + list.get(i));
//            return a / 2;
//        }
//        //奇数个，中位数为最中间的数
//        list.get(0);
//        Double b = Double.valueOf(list.get((list.size() + 1) / 2 - 1));
//        return Double.valueOf(list.get((list.size() + 1) / 2 - 1));
//    }
static LinkedList<Integer> list = new LinkedList();
    public static void Insert(Integer num) {
        if(list.size() == 0 || num <list.getFirst()){
            list.addFirst(num);
        }else if(num >= list.getLast()){
            list.addLast(num);
        }else {
            for(Integer e : list){
                if(num < e){
                    list.add(list.indexOf(e),num);
                    break;
                }
            }
        }
    }

    public static Double getMedian(){
        if(list.size() == 0){
            return null;
        }
        if(list.size() % 2 == 0){
            Double i = Double.valueOf(list.get(list.size()/2)+list.get(list.size()/2-1));
            return i/2;
        }else{
            Double i = Double.valueOf(list.get((list.size() + 1) / 2-1));
            return i;
        }
    }

    public static void main(String[] args) {
        //[5,2,3,4,1,6,7,0,8]
        Insert(5);
        Insert(2);
        Insert(3);
        Insert(4);
        Insert(1);
        Insert(6);
        Insert(7);
        Insert(0);
        Insert(8);
        System.out.println(list);
        System.out.println(getMedian());
    }
}