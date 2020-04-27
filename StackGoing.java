package Important;

import java.util.Scanner;
//import java.util.Stack;

public class StackGoing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++){
            arr[i] = scanner.nextInt();
        }
//        int n=7;
//        int[] arr = {3,4,1,5,6,2,7};
        int i = 0;
        while(i < n){
            rightiIndex(i,n,arr);
            leftIndex(i,n,arr);
            i++;
        }
    }
    private static void rightiIndex(int i,int n,int[] arr) {
        //int[] arr = {3,4,1,5,6,2,7};
        int j = i-1;
        while (i >= 0){
            if (i == 0){
                System.out.print("-1");
                return;
            }else if (arr[j] < arr[i]){
                System.out.print(j);
                return;
            }else {
                j--;
                if (j == -1) {
                    System.out.print("-1");
                    return;
                }
            }
        }
        //return;
    }
    private static void leftIndex(int i,int n,int[] arr) {
        int j = i+1;
        while (i < n) {
            if (i == n - 1) {
                System.out.println(" " + "-1");
                return;
            } else if (arr[j] < arr[i]) {
                System.out.println(" " + j);
                return;
            } else {
                j++;
                if (j == n) {
                    System.out.println(" " + "-1");
                    return;
            }
        }
//        return;
    }}
}
