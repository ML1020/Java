import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//该题目可用HashMap实现
//统计商人手上的珠子不同颜色的数量
//统计用户手上的珠子不同颜色的数量
//以用户为参考目标，判断商人是否存在用户要求的颜色和数量，
//统计差值并判断是否满足条件
public class BuyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //商人输入
        String have = scanner.nextLine();
        //用户输入
        String need = scanner.nextLine();

        //商人手上每个珠子的数量统计
        Map<Character,Integer> h = new HashMap<>();
        for (char c : have.toCharArray()){
            if (h.containsKey(c)){
                h.put(c,h.get(c) + 1);
            }else {
                h.put(c,1);
            }
        }

        //用户手上每个珠子的数量统计
        Map<Character,Integer> n = new HashMap<>();
        for (char c : need.toCharArray()){
            if (n.containsKey(c)){
                n.put(c,n.get(c) + 1);
            }else {
                n.put(c,1);
            }
        }

        //计算差值，以用户为参考
        boolean weatherBy = true;
        int lack = 0;
        for (Map.Entry<Character,Integer> en : n.entrySet()){
            char k = en.getKey();
            int v = en.getValue();
            //商人的珠子包含用户的珠子但是不够
            if (h.containsKey(k) && h.get(k) < v){
                weatherBy = false;
                lack += v - h.get(k);
                //商人的珠子不包含用户的珠子
            }else if (!h.containsKey(k)){
                weatherBy = false;
                lack += v;
            }
        }
        if (weatherBy){
            System.out.println("Yes " + (have.length() - need.length()));
        }else {
            System.out.println("No " + lack);
        }
    }
}
