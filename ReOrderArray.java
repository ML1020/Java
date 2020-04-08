package Important;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
// 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
// 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class ReOrderArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
    }
    public static void reOrderArray(int [] array) {
        int[] arr = new int[array.length];
        int j = 0;
        for (int i = 0;i < array.length;i++){
            if (array[i]%2 != 0){
                arr[j] = array[i];
                j++;
            }
        }
        for (int i = 0;i < array.length;i++){
            if (array[i]%2 == 0){
                arr[j] = array[i];
                j++;
            }
        }
        for (int i = 0;i < arr.length;i++) {
            array[i]=arr[i];
            System.out.println(array[i]);
        }
    }
}
