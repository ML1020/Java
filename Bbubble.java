package Sorts;

public class Bbubble {
    public static void bubbleSort(int[] array){
        for (int j = 0;j < array.length;j++){
            for (int i = 0;i < array.length-j-1;i++){
                if (array[i] > array[i+1]){
                    int temp;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] array,int value){
        int begin = 0;
        int end = array.length-1;
        int count = 0;
        while (begin <= end) {
            int mid = (begin + end)/2;
            count++;
            if (value < array[mid]){
                end = mid;
            }else if (value > array[mid]){
                begin = mid;
            }else {
                System.out.println("count=" + count);
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,5,2,3,6,4,9,8,7};
        bubbleSort(array);
        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("===========");
        binarySearch(array,2);
    }
}

