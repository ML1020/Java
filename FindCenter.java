package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class FindCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split(",");
        double[] arr = new double[strings.length];
        for (int i = 0;i < strings.length;i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(arr);
        if (arr.length % 2 != 0){
            int a = (int)arr[arr.length/2];
            System.out.println(a);
        }else {
//           double r = (Double)();
            System.out.println((arr[arr.length/2-1]+arr[arr.length/2])/2);
        }
    }
}

