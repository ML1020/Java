package Solution;

import java.util.*;

public class WashingPoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 1;
        while (n > 0) {
            int[] arr1 = new int[2];
            for(int i = 0;i < 2;i++){
                arr1[i] = sc.nextInt();
            }
//            int[] arr1 = {3, 2};
            int k = arr1[1];
            int[] arr2 = new int[2*arr1[0]];
            for(int j = 0;j < 2*arr1[0];j++){
                arr2[j] = sc.nextInt();
            }
//            int[] arr2 = {1, 2, 3, 4, 5, 6};
            while (k >= 1) {
                washPoke(arr2, k);
                k--;
            }
            n--;
        }
    }

    public static void washPoke(int[] arr2, int k) {
        int left = arr2.length / 2 - 1;
        int right = arr2.length - 1;
        Stack<Integer> stack = new Stack<>();
        for (; left >= 0 && right >= arr2.length / 2; left--, right--) {
            stack.add(arr2[right]);
            stack.add(arr2[left]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = stack.get(arr2.length-i-1);
        }
        if (k == 1) {
            System.out.print(stack.pop());
            for (int i = 1; i < arr2.length; i++) {
                System.out.print(" " + stack.pop());
            }
            System.out.println();
        }
    }
}