package Solution;

//给定一个仅包含大小写字母和空格 ' ' 的字符串，
//返回其最后一个单词的长度。
//如果不存在最后一个单词，请返回 0 。
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }
}
