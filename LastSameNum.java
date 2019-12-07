import java.util.Scanner;

//输入几组数据，判断其是否为守型数
//比如25的平方为625，低位与其相同，则输出yes，否则输出no
public class LastSameNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = a * a;
            String sa = Integer.toString(a);
            String sb = Integer.toString(b);
            char[] chara = sa.toCharArray();
            char[] charb = sb.toCharArray();
            int count = 0;
            for (int i = charb.length - 1; i >= charb.length - chara.length; i--) {
                for (int j = chara.length - 1-count; j >= 0; j--) {
                    if (charb[i] == chara[j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == chara.length) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }
}
