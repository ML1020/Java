package Sorts;
//取第一个数放入k中（此时a[0]为空），j从后往前找小于k的数放入a[0]中（此时只有a[j]为空，j--）
//i从前往后找大于k的数放入a[j]中（此时a[i]为空i++），
//然后j继续寻找小于k的数放入a[i],接着i寻找大于k的数放入a[j]，直到i==j跳出循环
//递归实现[l,i-1]、[i+1,r]
public class QuickSort {
    public static void quickSort(int a[],int l,int r){
        if(l >= r)
            return;
        int i = l; int j = r; int key = a[l];//选择第一个数为key
        while(i < j){    //当i==j的时候跳出循环
            while(i < j && a[j] >= key)//从右向左找第一个小于key的值
                j--;
            if(i < j){
                a[i] = a[j];
                i++;
            }
            while(i < j && a[i]<key)//从左向右找第一个大于key的值
                i++;
            if(i<j){
                a[j] = a[i];
                j--;
            }
        }
        //i == j
        a[i] = key;
        quickSort(a, l, i-1);//递归调用
        quickSort(a, i+1, r);//递归调用
    }
}
