package Solution;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ToLowerCaseStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String SString = scanner.nextLine();
        //String SString = "ABCDefg";
        toLowerCase(SString);
    }
    public static String toLowerCase(String str){
       // ArrayList<Character> list = new ArrayList<>();
        char[] chars = new char[str.length()];

        for (int i = 0;i < str.length();i++){
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
                chars[i] = (char)(str.charAt(i)+32);
               //list.add((char)(str.charAt(i)+32));
            }else{
                chars[i] = str.charAt(i);
                //list.add(str.charAt(i));
            }
        }

//        for (int i = 0;i < list.size();i++){
//            chars[i] = list.get(i);
//        }
//        String string = new String(chars);
//        System.out.println(string);

        //String string = Arrays.toString(chars);//[a, b, c, d, e, f, g]
        String string = new String(chars);   //abcdefg
        //String string =String.valueOf(chars);  //abcdefg
        System.out.println(string);
        return string;
    }
}
