import java.util.Scanner;

//改题目主要从三个部分开始
//1.循环输入怪兽数量，小易的初始化技能值
//2.第一组开始，输入怪兽防御值，进行PK
//3.PK结果，如果怪兽防御值<=小易的技能值，小易技能值加怪兽防御值
//如果怪兽防御值>=小易的技能值，小易技能值加怪兽防御值和小易技能值的最大公约数
public class FightE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int ability = 0;
        while (scanner.hasNext()){
            num = scanner.nextInt();//怪兽数量
            ability = scanner.nextInt();//小易初始化技能值
            for (int i = 0;i < num;i++){
                int monster = scanner.nextInt();
                if (monster <= ability){ //怪兽防御值 <= 技能值
                    ability+= monster;
                }else {//怪兽防御值 >= 技能值
                    ability += GCD(ability,monster);
                }
            }
            System.out.println(ability);
        }
        scanner.close();
    }

    //两数的最大公约数
    private static int GCD(int a, int b) {
        int temp;
        while (b > 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
