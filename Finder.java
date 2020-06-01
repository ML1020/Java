package Solution;
//以快排的方式 寻找第K大
import java.util.*;

public class Finder {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        findKth(a,5,3);
    }
    public static int findKth(int[] a, int n, int K) {
        // write code here
        quickSort(a,0,n-1);
        return a[n-K];//看清楚是第K大，不是第K小，我是从小到大排的数
    }
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
        quickSort(a, l, i-1);//递归调用zuo
        quickSort(a, i+1, r);//递归调用you
    }
}
