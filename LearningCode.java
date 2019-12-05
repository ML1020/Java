import java.util.ArrayList;
import java.util.Scanner;

public class LearningCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        int n = scanner.nextInt();  //总课程数
        int[] a = new int[n];  //相应课程的学分
        int[] b = new int[n];  //对应课程的实际得分
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        //课程的学分绩点 = 该课程绩点 * 该课程学分
        for (int j = 0;j < n;j++){
            if (b[j] >= 90 && b[j] <= 100){
                //绩点为4.0
                list.add(4.0 * a[j]);
            }
            if (b[j] >= 85 && b[j] <= 89){
                //3.7
                list.add(3.7 * a[j]);
            }
            if (b[j] >= 82 && b[j] <= 84){
                //3.3
                list.add(3.3 * a[j]);
            }
            if (b[j] >= 78 && b[j] <= 81){
                //3.0
                list.add(3.0 * a[j]);
            }
            if (b[j] >= 75 && b[j] <= 77){
                //2.7
                list.add(2.7 * a[j]);
            }
            if (b[j] >= 72 && b[j] <= 74){
                //2.3
                list.add(2.3 * a[j]);
            }
            if (b[j] >= 68 && b[j] <= 71){
                //2.0
                list.add(2.0 * a[j]);
            }
            if (b[j] >= 64 && b[j] <= 67){
                //1.5
                list.add(1.5 * a[j]);
            }
            if (b[j] >= 60 && b[j] <= 63){
                //1.0
                list.add(1.0 * a[j]);
            }
            if (b[j] < 60){
                //0
                list.add(0.0 * a[j]);
            }
        }

        double SUM1 = 0;double SUM2 = 0;
        double GPA = 0;
        for (int i = 0;i < n;i++){
            SUM1 += list.get(i);
            SUM2 += a[i];
        }
        GPA = SUM1 / SUM2;
        System.out.printf("%.2f",GPA);
    }
}
