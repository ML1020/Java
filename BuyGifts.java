package Solution;

import java.util.Scanner;

//输入描述
//输入第一行包含三个数n,m,k
//接下来一行n个整数ai ( 1≤ i ≤n )，空格隔开，表示商店从左到右摆放的每个装饰物的美丽值。
//需要购买m样装饰物。商店出售n种装饰物,一个装饰物的美丽值不能低于k
//输出描述
//输出一个数，表示小团购买的方案数。
//样例输入
//8 2 5  【n,m,k】
//5 5 5 4 5 5 5 5
//样例输出
//5
public class BuyGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //共n种
        int m = scanner.nextInt();  //想要m种
        int k = scanner.nextInt();  //都要大于5
        int[] array = new int[n];    //将所有可能存入数组中
        for (int i = 0;i < n;i++){
            array[i] = scanner.nextInt();
        }
//        int n = 8;
//        int m = 2;
//        int k = 5;
//        int[] array={5,5,5,4,5,5,5,5};

        int r=0;
        int count =0;
        int[] arr ;
//        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < n;i++) {
            for (int j = i;j < i+m && j < n;j++) {
//                sb.delete(0, m);
                if (array[j] < k) {
                    break;
                } else {
                    count++;
//                    sb.append(array[j]);
                }
            }
            if (count == m) {
                    r++;
            }
            count = 0;
        }
        System.out.println(r);
    }
}
