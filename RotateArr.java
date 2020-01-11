package Solution;

import java.util.Scanner;

public class RotateArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] nums = new int[7];
        for (int i = 0; i < nums.length; i++) {
                nums[i] = scanner.nextInt();
        }
        rotateArray(nums, k);
//        int k = 3;
//        int[] nums = {1,2,3,4,5,6,7};

        for (int i = 0;i < nums.length;i++){
           System.out.print(nums[i]);
        }
    }

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}

