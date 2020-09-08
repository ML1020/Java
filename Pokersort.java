package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pokersort {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String[] res;
//        int _pokers_size = 0;
//        _pokers_size = Integer.parseInt(in.nextLine().trim());
//        String[] _pokers = new String[_pokers_size];
//        String _pokers_item;
//        for(int _pokers_i = 0; _pokers_i < _pokers_size; _pokers_i++) {
//            try {
//                _pokers_item = in.nextLine();
//            } catch (Exception e) {
//                _pokers_item = null;
//            }
//            _pokers[_pokers_i] = _pokers_item;
//        }
//        res = pokersort(_pokers);
//        for(int res_i=0; res_i < res.length; res_i++) {
//            System.out.println(String.valueOf(res[res_i]));
//        }
        String[] pokers = {"3","4","5","6","7"};
        pokersort(pokers);
    }

    //给出一组忽略大王小王的扑克牌，从小到大排序
    //注意： 忽略花色，2最大，A比K大，2比A大
    //先将数字从3-10排序，下来为J\Q\K\A\2
    public static String[] pokersort(String[] pokers) {
        int[] a = new int[pokers.length];
        for (int i = 0;i < pokers.length;i++){
            a[i] = Integer.parseInt(pokers[i]);
        }
        int[] b = new int[pokers.length];
        for (int i = 0;i < pokers.length;i++){
            if (a[i] >= 3 && a[i] <= 10){
                b[i] = a[i];
                a[i] = '*';
            }
        }
        Arrays.sort(b);
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < b.length;i++){
            sb.append(b[i]);
        }
        for (int i = 0;i < pokers.length;i++){
            if (a[i] != '*'){
                if (pokers[i] == "J"){
                    sb.append(pokers[i]);
                }else if (pokers[i] == "Q"){
                    sb.append(pokers[i]);
                }else if (pokers[i] == "K"){
                    sb.append(pokers[i]);
                }else if (pokers[i] == "A"){
                    sb.append(pokers[i]);
                }else if (pokers[i] == "2"){
                    sb.append(pokers[i]);
                }
            }
        }
        String s = sb.toString();
        char[] chars = new char[pokers.length];
        ArrayList<String> list = new ArrayList<>();
        String[] se = new String[pokers.length];
        for (int i = 0;i < s.length();i++){
            list.add(s.charAt(i)+"");
        }
        String s1 = list.toString();
        for (int i = 0;i < s.length();i++){
            se[i] = list.get(i);
        }
        for (int i= 0;i < se.length;i++){
            System.out.println(se[i]);
        }
        return se;
    }
}