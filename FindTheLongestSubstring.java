package Solution;

public class FindTheLongestSubstring {
    public int findTheLongestSubstring(String s) {

        int len = s.length();

        if (len == 0)
            return 0;

        int[][] preSum = new int[len][5];
        int start = getIndex(s.charAt(0));
        if (start != -1)
            preSum[0][start]++;

        // preSum
        for (int i = 1; i < len; i++) {

            int idx = getIndex(s.charAt(i));

            for (int j = 0; j < 5; j++) {

                if (idx == j)
                    preSum[i][j] = preSum[i - 1][j] + 1;
                else
                    preSum[i][j] = preSum[i - 1][j];
            }
        }

        for (int i = len - 1; i >= 0; i--) {

            for (int j = 0; j < len - i; j++) {
                if (checkValid(preSum, s, i, i + j))
                    return i + 1;
            }
        }
        return 0;
    }


    public boolean checkValid(int[][] preSum, String s, int left, int right) {

        int idx = getIndex(s.charAt(left));

        for (int i = 0; i < 5; i++)
            if (((preSum[right][i] - preSum[left][i] + (idx == i ? 1 : 0)) & 1) == 1)
                return false;

        return true;
    }
    public int getIndex(char ch) {

        if (ch == 'a')
            return 0;
        else if (ch == 'e')
            return 1;
        else if (ch == 'i')
            return 2;
        else if (ch == 'o')
            return 3;
        else if (ch == 'u')
            return 4;
        else
            return -1;
    }
}
