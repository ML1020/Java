package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class DoWork {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            String s = scanner.nextLine();
//            String s1 = scanner.nextLine();
//            String[] strings = s.split(" ");
//            int[] x = new int[strings.length];
//            for (int i = 0; i < strings.length; i ++) {
//                x[i] = Integer.parseInt(strings[i]);
//            }
//            String[] strings1 = s1.split(" ");
//            int[] y = new int[strings.length];
//            for (int i = 0; i < strings.length; i ++) {
//                y[i] = Integer.parseInt(strings[i]);
//            }
        //y >= x
        int[] x = {0,1,2,3,4};
        int[] y = {1,1,1,4,5};
            Arrays.sort(x);
            Arrays.sort(y);
            int n = 0;
            for (int i = 0;i < x.length;i++){
                for (int j = i;j < y.length;j++){
                    if (y[j] >= x[i]){
                        n++;
                        y[j] = 0;
                        break;
                    }else {
                        break;
                    }
                }
            }
            System.out.println(n);
            return;
        }
//    }
}
