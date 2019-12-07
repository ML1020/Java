//输入IP地址 eg：10.0.3.193
//输入十进制整数
//输出IP地址转换的十进制整数
//输出十进制整数转换的IP地址
//看作二进制
//10  00001010 ； 0  00000000  ； 3  00000011 ； 11000001
//00001010 00000000 00000011 11000001
//组合起来的十进制为 167773121
//每段可以看作是0——255的整数，需要对IP地址进行校验

import java.util.*;

//遇到的问题，数组越界，输入格式不正确，应都为String输入；
//int型溢出，要换为long型
public class IPTransforNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String ip=in.nextLine();
            String p=in.nextLine();
            System.out.println(IptoTen(ip));
            TentoIp(p);
        }
    }

    private static void TentoIp(String p) {
        long temp=Long.parseLong(p);
        //返回整数参数的字符串表示形式为无符号整数。
        String ip=Long.toBinaryString(temp);
        StringBuilder sb=new StringBuilder();
        if(ip.length()<32){
            for(int i=0;i<(32-ip.length());i++){
                sb.append(0);
            }
            sb.append(ip);
        }else if(ip.length()==32){
            sb.append(ip);
        }
        for(int i=0;i<sb.length()-8;i=i+8){
            System.out.print(Integer.parseInt(sb.substring(i,i+8),2)+".");
        }
        System.out.println(Integer.parseInt(sb.substring(sb.length()-8,sb.length()),2));
    }

    private static long IptoTen(String ip) {
        String[] arr=ip.split("\\.");
        long n=Long.parseLong(arr[0]);
        for(int i=1;i<arr.length;i++){
            n=n<<8;
            n=n+Long.parseLong(arr[i]);
        }
        return n;
    }
}