package Important;

public class Sum_Solution {
    //求1+2+3+...+n，
    // 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
    public int Sum_Solution(int n) {
        int r=0;
        boolean ans=false;//如果ans为false,则执行下一步
        int a=0; // 界限
        ans=(n!=0)&&(a==(r=Sum_Solution(n-1)));  //n不为0这个为真，但是a不等于后面的，
        //所以结果为假，返回r+n，继续执行，结果为假，返回n-1，实现从n一直加到0；
        return r+n;
    }
}
