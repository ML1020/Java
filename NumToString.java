package Solution;

//有一个非负整数，请编写一个算法，打印该整数的英文描述。
//给定一个int x，请返回一个string，为该整数的英文描述。
//测试样例：
//1234
//返回："One Thousand,Two Hundred Thirty Four"
public class NumToString {
    //20以内的数字
    String[] baseNum = { "Zero", "One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen", };
    //20，30，40等90
    String[] tyNum = { "","Twenty", "Thirty", "Forty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninety" };
    //千，万，十万
    String[] bigNum = { "", "Thousand", "Million", "Billion" };

    public String toString(int x) {
        StringBuffer sb = null;
        int temp, j = 0;
        if (x == 0)   //当数字为0时直接返回0
            return baseNum[0];
        while (x != 0) {  //数字不为零时，判断x是否大于1000
            temp = x % 1000;
            if (temp != 0) {
                if (sb == null) {
                    sb = tempToString(temp).append(" "+bigNum[j]);
                } else {
                    sb = tempToString(temp).append(" " + bigNum[j] + "," + sb);
                }
            }
            j++;
            x /= 1000;
        }
        //trim()的作用是去掉字符串bai两端的多余的空格，
        // 注意，是两du端的zhi空格，且无论两端的空格有多少个都会dao去掉，
        // 当然中间的那些空格不会被去掉
        return sb.toString().trim();
    }

    // 将三位数转为字符串
    public StringBuffer tempToString(int str) {
        StringBuffer newsb = new StringBuffer();
        int i = str / 100;
        if (i != 0)
            newsb = newsb.append(baseNum[i] + " Hundred ");
        //十位数 位置判断
        i = str % 100;
        if (i > 0 && i <= 19)
            newsb = newsb.append(baseNum[i]);
        else if (i != 0) {
            newsb = newsb.append(tyNum[i / 10 - 1]);
            if (i % 10 != 0)
                //baseNum[i % 10]  个位数
                newsb.append(" " + baseNum[i % 10]);
        }
        return newsb;
    }
}