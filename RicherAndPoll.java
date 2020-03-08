package Solution;

public class RicherAndPoll {
    public static void main(String[] args) {
        long richP = 0,poolP = 0;
        for (int i = 1;i <= 30;i++){
            richP += 10;
            poolP = poolP+(long)Math.pow(2,i-1);
        }
        System.out.println(richP+" "+poolP);
    }
}
