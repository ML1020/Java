package Important;

public class MinNumberInRotateArray {
    public static void main(String[] args) {
        int[] array ={1,0,1,1,1};
//        int[] array ={1,1,1,0,1};
        minNumberInRotateArray(array);
    }
    public static int minNumberInRotateArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        //low + (high - low) / 2  = (low + high) / 2
        //int mid = left + (right-left)/2;
        while (left < right) {
            int mid = left + (right - left) / 2;
            //如果最左边的数小于最右边的数，则此数组是递增数列，返回左边最小的
            if (array[left] < array[right]) {
                System.out.println(array[left]);
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
}
