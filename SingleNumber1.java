package Important;

//    1.一个整型数组里除了两个数字之外，其他的数字都出现了两次。
//    请写程序找出这两个只出现一次的数字,并按顺序输出
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++){
            arr[i] = scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],2);
            }else {
                map.put(arr[i],1);
            }
        }
        int j = 0;
        for (int i = 0;i < arr.length;i++){
            if (map.get(arr[i]) == 1){
                arr[j] = arr[i];
                j++;
            }
        }
        if (arr[0] < arr[1]){
            System.out.println(arr[0]+" "+arr[1]);
        }else {
            System.out.println(arr[1]+" "+arr[0]);
        }
    }
//    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
//        Map<Integer,Integer> map = new HashMap<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0;i<array.length;i++){
//            if(map.containsKey(array[i])){
//                map.put(array[i],2);
//            } else{
//                map.put(array[i],1);
//            }
//        }
//        for(int j = 0;j < array.length;j++){
//            if(map.get(array[j]) == 1){
//                list.add(array[j]);
//            }
//        }
//        num1[0] = list.get(0);
//        num2[0] = list.get(1);
//        System.out.print(num1[0]);
//        System.out.print(num2[0]);
//    }
}
