package Solution;

import java.util.ArrayList;
public class MinNumberInRotateArray {
    public static int minNumberInRotateArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        //low + (high - low) / 2  = (low + high) / 2
        //int mid = left + (right-left)/2;
        while (left < right) {
            int mid = left + (right - left) / 2;
            //如果最左边的数小于最右边的数，则此数组是递增数列，返回左边最小的
            if (array[left] < array[right]) {
                return array[left];
            }
            if (array[left] < array[mid]) {
                left = mid + 1;
            } else if (array[mid] < array[right]) {
                right = mid;
            } else {
                left++;
            }
        }
        System.out.println(array[left]);
        return array[left];
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(minNumberInRotateArray(arr));
        ;
//        for (int i = 0;i < arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }
}
