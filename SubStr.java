//一个字符串数组p中的每一个元素是否是字符串s的子串，
//将字符串数组p中每个元素遍历判断的结果true或false组成数组返回。
public class SubStr{
    public boolean[] chkSubStr(String[] p,int n,String s) {
        //创建boolean数组
        boolean[] hasSub = new boolean[p.length];
        for (int i = 0;i < p.length;i++){
            hasSub[i] = s.contains(p[i]);
        }
        return hasSub;
    }
}
