package Important;

public class SortsResult {
    //冒泡，由小到大
    //从最后一个值向前比较，若小于则冒泡
    public static int[] popSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {   //表示要循环的趟数
            for (int j = arr.length - 1; j > i; j--) {    //比较的次数
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        return arr;
    }

    //取第一个数放入k中（此时a[0]为空），j从后往前找小于k的数放入a[0]中（此时只有a[j]为空，j--）
//i从前往后找大于k的数放入a[j]中（此时a[i]为空i++），
//然后j继续寻找小于k的数放入a[i],接着i寻找大于k的数放入a[j]，直到i==j跳出循环
//递归实现[l,i-1]、[i+1,r]
public static int[] quickSort(int a[], int left, int right) {
    if (left >= right){
            return a;
    }
    int i = left;
    int j = right;
    int key = a[left];//选择第一个数为key
    while (i < j) {    //当i==j的时候跳出循环
        //第一步：从右向左找第一个小于key的值
        // 当a[j]大于key时,j--继续寻找
        while (i < j && a[j] >= key) {
            j--;
        }
        //若不符合上述条件，则a[j]小于key，此时将key和a[j]交换位置
        if (i < j) {
            a[i] = a[j];
//           a[j] = key;
            i++;
        }
//        第二步：从左向右找第一个大于key的值
        //当a[i] < key时，i++继续寻找
        while (i < j && a[i] < key) {
            i++;
        }
//        若不符合上述条件，则a[i]大于key，此时将key和a[i]交换位置
        if (i < j) {
            a[j] = a[i];
//            a[i] = key;
            j--;
        }
    }
    //当i == j 时，可以将数组分为两个部分，一次循环左半边和右半边
    a[i] = key;
    quickSort(a, left, i-1);//递归调用zuo
    quickSort(a, i + 1, right);//递归调用you
    return a;
}


    public static void main(String[] args) {
        int[] arr = {5,6,3,8,4,7,1,2};
//        popSort(arr);
        System.out.println("========");
//        System.out.println(popSort(arr));
        quickSort(arr,0,arr.length-1);
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}
