package Solution;

import java.util.Scanner;
//        *⼤写字⺟（A~Z)：65(A)~90(Z)
//        *⼩写字⺟（a~z)：97(a)~122(z)
public class StringFindKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String needjia = scanner.nextLine();
            String needjie = scanner.nextLine();
//        String needjia = "abcdefgz00_";
//        String needjie = "BCDEFGHZ11_";
            StringBuffer sba = new StringBuffer();
            StringBuffer sbe = new StringBuffer();
            for (int i = 0; i < needjia.length(); i++) {
                char[] na = needjia.toCharArray();
                if (na[i] >= 'a' && na[i] <= 'z') {
                    if (na[i] != 'z') {
                        na[i] = (char) (na[i] - 31);
                    } else {
                        na[i] = (char) (na[i] - 57);
                    }
                    sba.append(na[i]);
                    continue;
                }
                if (na[i] >= 'A' && na[i] <= 'Z') {
                    if (na[i] != 'Z') {
                        na[i] = (char) (na[i] + 33);
                    } else {
                        na[i] = (char) (na[i] + 7);
                    }
                    sba.append(na[i]);
                    continue;
                }
                if (na[i] >= '0' && na[i] <= '9') {
                    if (na[i] != '9') {
                        na[i] = (char) (na[i] + 1);
                    } else {
                        na[i] = (char) (na[i] - 9);
                    }
                    sba.append(na[i]);
                    continue;
                } else {
                    sba.append(needjia.charAt(i));
                    continue;
                }
            }

            for (int i = 0; i < needjie.length(); i++) {
                char[] ne = needjie.toCharArray();
                if (needjie.charAt(i) >= 'a' && needjie.charAt(i) <= 'z') {
                    if (ne[i] != 'a') {
                        ne[i] = (char) (ne[i] - 33);
                    } else {
                        ne[i] = (char) (ne[i] - 7);
                    }
                    sbe.append(ne[i]);
                    continue;
                }
                if (needjie.charAt(i) >= 'A' && needjie.charAt(i) <= 'Z') {
                    if (ne[i] != 'A') {
                        ne[i] = (char) (ne[i] + 31);
                    } else {
                        ne[i] = (char) (ne[i] + 57);
                    }
                    sbe.append(ne[i]);
                    continue;
                }
                if (needjie.charAt(i) >= '0' && needjie.charAt(i) <= '9') {
                    if (ne[i] != '0') {
                        ne[i] = (char) (ne[i] - 1);
                    } else {
                        ne[i] = (char) (ne[i] + 9);
                    }
                    sbe.append(ne[i]);
                    continue;
                } else {
                    sbe.append(needjie.charAt(i));
                    continue;
                }
            }
            System.out.println(sba.toString());
            System.out.println(sbe.toString());
        }
    }
}
