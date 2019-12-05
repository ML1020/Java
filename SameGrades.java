import java.util.Scanner;

//输入人数，输入分数
//输入目标分数
//循环变量分数数组，计算和目标分数相等的分数出现的频次
//打印输出目标分数出现的频次
public class SameGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();//输入的人数
            if (N == 0){  //如果检测到输入的人数为0 ，则结束
                return;
            }
            int[] array = new int[N];  //保存N个人的分数
            for (int i = 0;i < array.length;i++){
                array[i] = scanner.nextInt();
            }
            int t = scanner.nextInt(); //目标分数，输出击中目标分数的个数
            int count = 0;
            for (int i = 0;i < array.length;i++){
                if (t == array[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
