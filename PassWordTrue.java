//密码要求
//1.长度超过8位
//2.包括大小写字母数字其它符号，以上四种至少三种
//3.不能有相同长度超2的子串重复
//说明:长度超过2的子串

import java.util.Scanner;

public class PassWordTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            if (checkPassWord1(chars) && checkPassWord2(chars) && checkPassWord3(s)) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    private static boolean checkPassWord1(char[] chars) {
        //1.长度超过8位
        if (chars.length <= 8 || chars.length == 0) {
            return false;
        }
        return true;
    }

    private static boolean checkPassWord2(char[] chars) {
        int[] a = new int[4];
        //2.包括大小写字母数字其它符号，以上四种至少三种
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                a[0] = 1;
            }
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                a[1] = 1;
            }
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                a[2] = 1;
            } else {
                a[3] = 1;
            }
        }
        int sum = 0;
        for (int j = 0; j < 4; j++) {
            sum += a[j];
        }
        return sum >= 3 ? true : false;
    }

    private static boolean checkPassWord3(String password) {
        for (int i = 0; i < password.length() - 2; i++) {
            String substr1 = password.substring(i, i + 3);
            if (password.substring(i + 1).contains(substr1))
                return false;
        }
        return true;
    }
}
