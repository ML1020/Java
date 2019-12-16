import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

//可使用Arrays的排序方法以及BigInteger即可完成
public class BigIntegerSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            BigInteger[] bg = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                bg[i] = scanner.nextBigInteger();
            }
            Arrays.sort(bg);
            for (int i = 0; i < n; i++) {
                System.out.println(bg[i]);
            }
        }
    }
}
