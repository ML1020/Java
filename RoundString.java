package Solution;

import java.util.Scanner;

public class RoundString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
        scanner.nextLine();
            for (int y = 0; y < n; y++) {
                String s = scanner.nextLine();
//        String s = "ABCABDABDABEABEABF";
                //以3为周期的近似字符串
                //近似字符串最多只有一位不同
                if (s.length() % 3 != 0) {
                    System.out.println("No");
                } else {
                    String[] strings = new String[s.length() / 3];
                    int j = 0;
                    for (int x = 0; x < strings.length; x++) {
                        for (; j < s.length(); ) {
                            strings[x] = s.substring(j, j + 3);
                            j = j + 3;
                            break;
                        }
                    }
                    for (int i = 0; i < strings.length - 1; i++) {
                        if (strings[i].charAt(0) == strings[i + 1].charAt(0)
                                && strings[i].charAt(1) == strings[i + 1].charAt(1)) {
                            if (i == strings.length - 2) {
                                System.out.println("Yes");
                            }
                        }
                        else if (strings[i].charAt(1) == strings[i + 1].charAt(1)
                                && strings[i].charAt(2) == strings[i + 1].charAt(2)) {
                            if (i == strings.length - 2) {
                                System.out.println("Yes");
                            }
                        }
                        else if (strings[i].charAt(0)==strings[i+1].charAt(0)
                                &&strings[i].charAt(2)==strings[i+1].charAt(2)){
                            if (i == strings.length - 2) {
                                System.out.println("Yes");
                            }
                        }
                        else {
                            System.out.println("No");
                        }
                    }
                }
            }
        }
    }
//}
//                    for (int i = 0;i < strings.length-1;i++) {
//                        if (strings[i].charAt(1) == strings[i + 1].charAt(1)
//                                && strings[i].charAt(2) == strings[i + 1].charAt(2)) {
//                            if (i == strings.length - 2) {
//                                System.out.println("Yes");
//                            }
//                        }else {
//                            System.out.println("No");
//                        }
//                    }
//                    for (int i = 0;i < strings.length-1;i++) {
//                        if (strings[i].charAt(0)==strings[i+1].charAt(0)
//                                &&strings[i].charAt(2)==strings[i+1].charAt(2)){
//                            if (i == strings.length - 2) {
//                                System.out.println("Yes");
//                            }
//                        }else {
//                            System.out.println("No");
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
