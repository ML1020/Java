package Solution;

import java.util.*;

public class FindNumSmall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
            max += arr[i] > 0 ? 1 : 0;
        }
        for (int i = 0; i < n; i++) {
            long cur = arr[i];
            while (cur > 0 && cur <= max && arr[(int) (cur - 1)] != cur) {
                long tmp = arr[i];
                arr[i] = arr[(int) (cur - 1)];
                arr[(int) (cur - 1)] = tmp;
                cur = arr[i];
            }
        }
        int res = max + 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                res = i + 1;
                break;
            }
        }
        System.out.println(res);
    }
}