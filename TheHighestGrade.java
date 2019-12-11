import java.util.Scanner;

//第一行：n个学生m个老师可以询问或更新m次
//第二行：1-n个学生的成绩，学生ID也从1-n
//m行：老师操作Q询问指定ID范围的学生成绩，输出最高成绩
//老师操作U更新指定ID的学生成绩
//解题思路：
//交互式输入：学生数量，老师可操作次数，学生成绩
//循环执行m次，如果输入Q进行最大分数计算，如果输入U进行分数更新
public class TheHighestGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;
        while (scanner.hasNext()){
            n = scanner.nextInt();//学生数量
            m = scanner.nextByte();//老师可操作次数
            int[] student = new int[n];
            for (int i = 0;i < n;i++){
                student[i] = scanner.nextInt();
            }
            //老师询问
            for (int i = 0;i < m;i++){
                String c = scanner.next();//next可以读一个字符
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (c.equals("Q")){
                    int s = Math.min(a,b);//开始下标
                    int e = Math.max(a,b);//结束下标
                    int max = student[s - 1];
                    //计算出[s-1,e]范围的最大值
                    for (int index = s;index < e;index++){
                        max = Math.max(max,student[index]);
                    }
                    System.out.println(max);
                }
                if (c.equals("U")){
                    student[a - 1] = b;
                }
            }
        }
    }
}
