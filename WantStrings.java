import java.util.Scanner;

public class WantStrings {
    //第一行输入店铺字符，第二行输入想要的字符
    //想要的字符与店铺的字符比较
    //若完全包含，则输出 yes + 多余的字符个数
    //若有没有完全包含，则输出 no + 缺少的字符个数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();   //店铺
        String s2 = scanner.nextLine();   //想要
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
//        char[] chars1 = {'A', 'B', 'C', 'D', 'E', 'F'};
//        char[] chars2 = {'A', 'B', 'D'};
        for (int i = 0; i < chars2.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                if (chars2[i] == chars1[j]) {
                    chars2[i] = '*';
                    chars1[j] = '*';
                    continue;
                }
            }
        }
        int n1 = 0, n2 = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != '*') {
                n1++;
            }
        }
        for (int j = 0; j < chars2.length; j++) {
            if (chars2[j] != '*') {
                n2++;
            }
        }
        //若相等则全部赋值*
        //当想要的珠子全部为*时，证明n2 == 0
        if (n2 != 0) {
            System.out.println("No " + n2);
        } else {
            System.out.println("Yes " + n1);
        }
    }
}

