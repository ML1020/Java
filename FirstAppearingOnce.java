package Important;

//请实现一个函数用来找出字符流中第一个只出现一次的字符。
//        例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
//        当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。


//使用一个HashMap来统计字符出现的次数，同时用一个ArrayList来记录输入流，
// 每次返回第一个出现一次的字符都是在这个ArrayList（输入流）中的字符作为key去map中查找。

import java.util.*;
public class FirstAppearingOnce {
    HashMap<Character, Integer> map=new HashMap();
    ArrayList<Character> list=new ArrayList<Character>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }

        list.add(ch);
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {	char c='#';
        for(char key : list){
            if(map.get(key)==1){
                c=key;
                break;
            }
        }

        return c;
    }
}

//public class Solution{
//    int[] hashtable=new int[256];
//    StringBuffer s=new StringBuffer();
//    //Insert one char from stringstream
//    public void Insert(char ch)
//    {
//        s.append(ch);
//        if(hashtable[ch]==0)
//            hashtable[ch]=1;
//        else hashtable[ch]+=1;
//    }
//    //return the first appearence once char in current stringstream
//    public char FirstAppearingOnce()
//    {
//        char[] str=s.toString().toCharArray();
//        for(char c:str)
//        {
//            if(hashtable[c]==1)
//                return c;
//        }
//        return '#';
//    }
//}