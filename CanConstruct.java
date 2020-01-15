package Solution;

import java.util.ArrayList;

public class CanConstruct {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "aab";
        canConstruct(s1,s2);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == "" && magazine == ""){
            System.out.println("dui");
            return true;
        }
        for (int i = 0;i < magazine.length();i++){
            if (magazine.charAt(i) == ransomNote.charAt(0)){
                if (ransomNote.contains(magazine.substring(i,i+ransomNote.length()))){
                    System.out.println("dui");
                    return true;
                }
                System.out.println("cuo");
                return false;
            }
        }
        return false;

//        ArrayList<Character> list1 = new ArrayList<>();
//        ArrayList<Character> list2 = new ArrayList<>();
//        for (int i = 0 ; i < ransomNote.length();i++){
//            list1.add(ransomNote.charAt(i));
//        }
//        for (int j = 0;j < magazine.length();j++){
//            list2.add(magazine.charAt(j));
//        }
//        if (list1.equals(list2)){
//            System.out.println("dui");
//            return true;
//        }
//        System.out.println("cuo");
//        return false;
    }
}
