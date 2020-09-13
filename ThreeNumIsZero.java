package Solution;

import java.util.*;

public class ThreeNumIsZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ") ;
        int[] arr = new int[s1.length];
        for (int i = 0;i <s1.length;i++){
            arr[i] = Integer.parseInt(s1[i]);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int[][] array;
        Arrays.sort(arr);
        for (int i = 0;i < arr.length-2;i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i+1;int k = arr.length-1;
            while (j < k){
                if (arr[i]+arr[j]+arr[k] == 0){
                    ArrayList<Integer> list1 = new ArrayList<>();
                    list1.add(arr[i]);
                    list1.add(arr[j]);
                    list1.add(arr[k]);
                    list.add(list1);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j-1]){
                        j++;
                    }
                    while (j < k && arr[k] == arr[k+1]){
                        k--;
                    }
                }else if (arr[i]+arr[j]+arr[k] > 0){
                    k--;
                }else {
                    j++;
                }
            }
        }
        StringBuffer sb =new StringBuffer();
        for (int i = 0;i < list.size();i++){
            sb = new StringBuffer();
            for (int j = 0;j < 3;j++){
                sb.append(list.get(i).get(j));
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}
