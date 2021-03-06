package Important;

import java.util.Scanner;

//题目描述
//考拉有n个字符串字符串，任意两个字符串长度都是不同的。
// 考拉最近学习到有两种字符串的排序方法： 1.根据字符串的字典序排序。例如：
//"car" < "carriage" < "cats" < "doggies < "koala"
//2.根据字符串的长度排序。例如：
//"car" < "cats" < "koala" < "doggies" < "carriage"
//考拉想知道自己的这些字符串排列顺序是否满足这两种排序方法，
// 考拉要忙着吃树叶，所以需要你来帮忙验证。
//输入描述:
//输入第一行为字符串个数n(n ≤ 100)
//接下来的n行,每行一个字符串,字符串长度均小于100，均由小写字母组成
//输出描述:
//如果这些字符串是根据字典序排列而不是根据长度排列输出"lexicographically",
//如果根据长度排列而不是字典序排列输出"lengths",
//如果两种方式都符合输出"both"，否则输出"none"
//示例1
//输入
//3
//a
//aa
//bbb
//输出
//both
public class TwoMethonToSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = scanner.next();
            }
            System.out.println(validate(words));
        }
        scanner.close();
    }

    private static String validate(String[] words) {
        boolean isABC = isAbc(words);
        boolean isLEN = isLen(words);
        if (isABC && isLEN) {
            return "both";
        }
        if (isABC) {
            return "lexicographically";
        }
        if (isLEN) {
            return "lengths";
        }
        return "none";
    }

    private static boolean isLen(String[] words) {
        boolean result = true;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() <= words[i - 1].length()) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean isAbc(String[] words) {
        boolean result = true;
        for (int i = 1; i < words.length; i++) {
            if (words[i].compareTo(words[i - 1]) <= 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
