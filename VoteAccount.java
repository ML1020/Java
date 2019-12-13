import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//改题目主要是想实现一个投票统计，设置候选人数，候选人名单，投票人数
//投票纪录，然后进行投票纪录的统计，计算出每位候选人的获票数量
//题目解析：
//整个题目核心解决思路就是，维护HashMap结构，Key表示候选人名称，
//value表示候选人获得投票的数量，通过Scanner的用户输入，进入HashMap中的
//数据维护，最后投票记录完成输入，此时按行要求输出HashMap中的key-value对即可。
public class VoteAccount {
    public static void main(String[] args) {
        //控制台输入数据
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            //候选人人数
            int n = scanner.nextInt();
            String[] strings = new String[n];
            //记录候选人
            HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
            for (int i = 0;i < n;i++){
                String temp = scanner.next();
                hashMap.put(temp,0);
                strings[i] = temp;
            }
            //投票人数
            int m = scanner.nextInt();
            Set<String> keys = hashMap.keySet();
            int count = 0;
            for (int i = 0;i < m;i++){
                //投票
                String tick = scanner.next();
                if (keys.contains(tick)){
                    hashMap.put(tick,hashMap.get(tick)+1);
                }else {
                    count++;
                }
            }
            //输出结果
            for (String k : strings){
                System.out.println(k + " : " + hashMap.get(k));
            }
            System.out.println("Invalid : " + count);
        }
        scanner.close();
    }
}
