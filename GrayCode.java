package Solution;
//格雷码
//        1：  0     1
//        2： 00    01    11    10
//        3：000    001   011   010   er之前加0
//           110    111   101   100   倒er之前加1
//        4：0000   0001   0011  0010      3之前0
//           0110   0111   0101  0100      倒3之前加0
//           1100   1101   1111  1110      3之前1
//           1010   1011   1001  1000      倒3之前加1

import java.util.Scanner;

public class GrayCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        getGray(n);
    }
    public static String[] getGray(int n) {
        String[] result = new String[1 << n];
        if (n == 1){
            result[0] = "0";
            result[1] = "1";
            return result;
        }
        String[] temp = getGray(n-1);
        int j = 0;
        for (int i = 0;i < (1 << n);i++){
            if (i < (1 << n)/2){
                result[i] = "0" + temp[j++];
            }else if (i >= (1 << n)/2){
                result[i] = "1" + temp[--j];
            }
        }
        for (int i = 0;i < result.length;i++){
            System.out.println(result[i]);
        }
        return result;
    }
}