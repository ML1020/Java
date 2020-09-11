package Solution;

import java.util.Scanner;

public class FindPassWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//            String s = "PASSWORD_123";
        int a = 0,b=0,c=0,d=0;
        if(s.length() >= 8){
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    a++;
                }else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                    b++;
                }else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    c++;
                }else{
                    d++;
                }
            }
            if (a>=1&&b>=1&&c>=1&&d>=1){
                System.out.println("Ok");
            }else if (a<1 || b < 1 || c < 1 || d <1){
                System.out.println("Irregular password");
            }
        }else if(s.length() <8){
            System.out.println("Irregular password");
        }
    }
}
