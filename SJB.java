package Solution;

//石头剪刀布、字符串构造、涂色1、交朋友

import java.util.Scanner;

public class SJB {
    //第一行输入局数
    //第二行输入牛妹、牛牛 左右手的剪刀石头布
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] strings = s.split(" ");
            Left(strings);
            Right(strings);
            if (Left(strings) > Right(strings)) {
                System.out.println("left");
            } else if (Left(strings) < Right(strings)) {
                System.out.println("right");
            } else if (Left(strings) == Right(strings)) {
                System.out.println("same");
            }
        }
    }
//            scanner.close();
//        }
//    }

    public static int Left(String[] s) {
        int left = 0;
        if (s[0].contains("S") && s[2].contains("J")) {
            left++;
        } else if (s[0].contains("S")&& s[3].contains("J")) {
            left++;
        } else if (s[0].contains("J") && s[2].contains("B")) {
            left++;
        } else if (s[0].contains("J") && s[3].contains("B")) {
            left++;
        } else if (s[0].contains("B") && s[2].contains("S")) {
            left++;
        } else if (s[0].contains("B") && s[3].contains("S")) {
            left++;
        }
        return left;
    }

    public static int Right(String[] s) {
        int right = 0;
        if (s[1].contains("S") && s[2].contains("J")) {
            right++;
        } else if (s[1].contains("S")&& s[3].contains("J")) {
            right++;
        } else if (s[1].contains("J") && s[2].contains("B")) {
            right++;
        } else if (s[1].contains("J") && s[3].contains("B")) {
            right++;
        } else if (s[1].contains("B") && s[2].contains("S")) {
            right++;
        } else if (s[1].contains("B") && s[3].contains("S")) {
            right++;
        }
        return right;
    }
}