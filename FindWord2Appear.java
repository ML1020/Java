package Solution;

import java.util.*;

public class FindWord2Appear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0;i < strings.length;i++){
            if (!map.containsKey(strings[i])) {
                map.put(strings[i],1);
            }else {
                map.put(strings[i],map.get(strings[i])+1);
            }
        }

        int[] arr = new int[map.size()];
        int i = 0;
        Set<Map.Entry<String,Integer>> entrys = map.entrySet();
//        Set<String> set = map.keySet();
        while (i < arr.length){
            for (Map.Entry<String, Integer> entry : entrys) {
                arr[i] = entry.getValue();
                i++;
            }
        }
        Arrays.sort(arr);
        int max = 0;
        StringBuffer sb = new StringBuffer();
        String s1 = "";
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entrys) {
            if (entry.getValue() == arr[arr.length-2]){
                list.add(entry.getKey());
            }
        }
        for (int j = 0;j < list.size();j++){
            if (list.get(j).length() > max){
                s1 = list.get(j);
                max = list.get(j).length();
            }
        }
        System.out.println(s1);
    }
}
