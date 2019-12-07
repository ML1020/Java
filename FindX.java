import java.util.Scanner;

//输入一个数字n，再输入n个不同的数
//再输入一个x，寻找x对应的下标，若没找到，则输出-1
public class FindX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int count = 0;
        for (int i = 0;i < a.length;i++){
            if (x == a[i]){
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        }
    }
}
