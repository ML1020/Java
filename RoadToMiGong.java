package Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class RoadToMiGong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();   //n行
            int m = sc.nextInt();   //m列
            sc.nextLine();
            String[] arr = new String[n];
            char[][] chars = new char[n][m];
            for (int i=0;i < n;i++){
                arr[i] = sc.nextLine();
            }
            for (int i = 0;i < n;i++){
                for (int j = 0;j < m;j++){
                    chars[i][j] = arr[i].charAt(j);
                }
            }
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0;i < n;i++){
                for (int j = 0;j < m;j++){
                    if (chars[i][j] == '.' && chars[i][j+1] == '.' && chars[i+1][j] == '.'){
                        continue;
                    }else if (chars[i][j] == 'a' || chars[i][j+1] == 'b' || chars[i+1][j] == 'c'
                    || chars[i][j] == 'd' || chars[i][j+1] == 'e'){
                        list.add(chars[i][j+1]);
                    }else if (chars[i][j] == 'A' || chars[i][j+1] == 'B' || chars[i+1][j] == 'C'
                            || chars[i][j] == 'D' || chars[i][j+1] == 'E'){
                    }
                }
            }

            System.out.println("YES");
        }
    }
}
