import java.util.Scanner;

//将里面的数字和字母同意看成是char类型的，
//所以数字3实际存储时为ASCII码中的‘3’
//其十进制表示的51，转化为二进制表示就是0110011，
//取最高位为奇校验位，校验位为1，
//所以校验后的二进制数为10110011，字母同理。
//故本体只需将输入的字符减去‘\0’得到字符的十进制表示，
//再将其转化为七位二进制数加上一位校验位输出即可
public class CheckJiOu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            jiJiaoYan(string.toCharArray());//将输入的字符串统一转换为字符数组
        }
    }

    private static void jiJiaoYan(char[] s) {
        int[] result = new int[8];
        for (int i = 0;i < s.length;i++){
            int n = 0x01;
            int j = 7;
            int sum = 0;
            while (j > 0){//需要进行7次运算，得出1的个数及二进制形式
                result[j] = (s[i] & n) == 0 ? 0 : 1;  //与运算
                if (result[j] == 1){
                    sum ++;  //个数
                    n = n << 1;
                    j--;
                }
                if ((sum & 1) == 0){
                    result[0] = 1;   //进行校验
                }
                for (int k = 0;k < result.length;k++){
                    System.out.print(result[k]);
                }
                result[0]  = 0;
                System.out.println();
            }
        }
    }
}
