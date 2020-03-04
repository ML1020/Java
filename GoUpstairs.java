package Solution;

public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        if (n == 1 || n == 2){
            return n;
        }
        if (n == 3){
            return 4;
        }
        int a = 1;
        int b = 2;
        int c = 4;
        for(int i=4;i<=n;i++){
            int temp = ((a+b)%1000000007+c)%1000000007;
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }
}
