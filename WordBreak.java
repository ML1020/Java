package Solution;

import java.util.List;
//给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，
//判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
//说明：
//拆分时可以重复使用字典中的单词。
//你可以假设字典中没有重复的单词
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        // 可以类比于背包问题
        int n = s.length();
        // memo[i] 表示 s 中以 i - 1 结尾的字符串是否可被 wordDict 拆分
        boolean[] memo = new boolean[n + 1];
        memo[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (memo[j] && wordDict.contains(s.substring(j, i))) {
                    memo[i] = true;
                    break;
                }
            }
        }
        return memo[n];
    }
}