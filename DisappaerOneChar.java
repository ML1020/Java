package Solution;

import java.util.Scanner;

public class DisappaerOneChar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s1 = scanner.nextLine();
            int[] arr = new int[256];
            for(int i = 0;i < s1.length();i++){
                arr[s1.charAt(i)]++;
            }
            for (int i = 0;i < s1.length();i++){
                if (arr[s1.charAt(i)] == 1){
                    System.out.println(s1.charAt(i));
                    break;
                }else if (i == s1.length()-1 && arr[s1.charAt(i)] != 1){
                    System.out.println("-1");
                }
            }
        }
    }
}
