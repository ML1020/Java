package Solution;

import java.util.*;

public class ThreeNumIsZero {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
        String s = "-1 0 1 2 -1 -4";
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
                }else if (arr[i]+arr[j]+arr[k] > 0){  //如果大于则最右边需要左移，和会变小
                    k--;
                }else {  //如果小于则说明最左边需要右移，和会变大
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

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        String[] string = s.split(" ");
//        int[] arr = new int[string.length];
//        for(int i = 0;i < string.length;i++){
//            arr[i] = Integer.parseInt(string[i]);
//        }
//        Arrays.sort(arr);
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i = 0;i < arr.length-2;i++){
//            int left = i+1;
//            int right = arr.length-1;
//            int count = 0-arr[i];
//            while(left < right){
//                if(arr[left] + arr[right] == count){
//                    list.add(Arrays.asList(arr[left],arr[i],arr[right]));
//                    //去重
//                    while(left < right && arr[left] == arr[left+1]){
//                        left++;
//                    }
//                    while(left < right && arr[right] == arr[right-1]){
//                        right--;
//                    }
//                    left++;
//                    right--;
//                }else if(arr[left] + arr[right] < count){
//                    //小于时，左下标右移，并且关注去重
//                    while(left < right && arr[left] == arr[left+1]){
//                        left++;
//                    }
//                    left++;
//                }else{
//                    //大于时，右下标左移，并且关注去重
//                    while(right > left && arr[right] == arr[right-1]){
//                        right--;
//                    }
//                    right--;
//                }
//            }
//        }
//        System.out.println(list);
//    }
//}
