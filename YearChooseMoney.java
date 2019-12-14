import java.util.Scanner;

//该题目是计算中奖率，题目描述中抽奖是无放回的，
//问题可转换成排列组合问题
//抽奖可能出现的情况作为分母：F
//n = 1出现1种情况
//n = 2出现2种情况
//n = 3出现6种情况
//n出现n！种情况
//每个人不可能抽中的情况作为分子：C
//假设每个人都中奖，可以认为n个元素都在中奖的位置
//假设每个人都不中奖，那么只要确保n个元素不在原有中将位置即可，
//此时问题可转换成如何错排n个元素
//无法中奖的概率为：C/F*100%
public class YearChooseMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();//测试数组
            float sum1 = factorial(n);
            float sum2 = count(n);
            //将得到的分子分母进行相除，即可得到概率
            float result1 = (sum2/sum1)*100;
            System.out.println(String.format("%.2f",result1) + "%");
        }
    }

    //错排算法
    public static float count(int n){
        if (n == 1){
            return 0;
        }else if (n == 2){
            return 1;
        }else {
            return (n-1)*(count(n-1)+count(n-2));
        }
    }

    //n的阶乘
    private static float factorial(int num) {
        float result = 1;
        if (num == 0){
            return 1;
        }else if (num > 0){
            result = num * factorial(num - 1);
        }
        return result;
    }
}
