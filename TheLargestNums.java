package Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class TheLargestNums {
    public static String findNums(String string){
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        string.toLowerCase();
        for (int i = 0;i < string.length();i++){
            if (string.charAt(i) >= '0' && string.charAt(i)<= '9'){
                list1.add(string.charAt(i));
                if (i == string.length()-1){
                    list.add(new ArrayList<>(list1));
                    list1.clear();
                }
            }else if (!list1.isEmpty() && string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                list.add(new ArrayList<>(list1));
                list1.clear();
            }
        }
//        System.out.println(list);
//        System.out.println(list.get(0).size());
//        System.out.println(list.get(1).size());
        int maxlength = 0;
        for (int i =0;i<list.size()-1;i++){
            if (list.get(i).size() < list.get(i+1).size()){
               maxlength = list.get(i+1).size();
            }
        }
        for (int i =0;i<list.size();i++){
            if (list.get(i).size() == maxlength){
                String sss = list.get(i).toString();
                System.out.println(sss);
//                String[] a = list.toArray(new String[list.get(i).size()]);
//                for (String s : a){
//                    System.out.println(s);
//                    return s;
//                }
            }
        }
        return string;
    }

    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
      //  String string = scanner.nextLine();
        String string = "abcd12345ed125ss123456789";
        findNums(string);
    }
}
