import java.util.Scanner;

//整数与IP地址之间的转换
//主要考察通过解析字符串处理，类型转换
//IP地址转10进制IP地址：IP地址拆分，每段转二进制，二进制字符串转Long
//10进制IP地址转IP地址：10进制IP转二进制字符串，不足32位补位，
//按照每段8位进行拆分，每段转10进制，拼接4段组成IP地址
public class IPTransforNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String ip = scanner.nextLine();//输入IP地址字符串
            String ip10 = scanner.nextLine();//输入10进制表示的IP地址字符串
            System.out.println(converIp10(ip));//IP地址转10进制字符串
            System.out.println(converIp(ip10));//10进制IP地址转IP地址
        }
    }

    private static long converIp10(String ip) {
        String[] ips = ip.split("\\.");//使用，分割
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < ips.length;i++){
            sb.append(binaryString(ips[i]));//十进制转二进制字符串
        }
        return Long.parseLong(sb.toString(),2);
    }

    private static String binaryString(String s) {//十进制转为8位2进制
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(s);
        int k = 1 << 7;
        for (int i= 0;i < 8;i++){
            int flag = (num & k) == 0 ? 0 : 1;
            sb.append(flag);
            num = num << 1;
        }
        return sb.toString();
    }

    private static String converIp(String ip10) {
        StringBuffer sb = new StringBuffer();
        //长整型转2进制字符串(JDK Long的静态方法)
        String ip2 = Long.toBinaryString(Long.parseLong(ip10));
        String as = "";
        if (ip2.length() < 32){//不足32位前面补0
            for (int i = 0;i < 32 - ip2.length();i++){
                as += "0";
            }
        }
        ip2 = as + ip2;
        //IP地址每一段拼接
        String[] ips = new String[4];
        ips[0] = ip2.substring(0,8);
        ips[1] = ip2.substring(8,16);
        ips[2] = ip2.substring(16,24);
        ips[3] = ip2.substring(24);
        for (int i = 0;i < 4;i++){
            sb.append(Integer.parseInt(ips[i],2));
            if (i != 3){
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
