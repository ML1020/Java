package Demo;

public class StringDemo {
    public static void main(String[] args) {
//        String str = "hello world hello bit" ;
//        String[] result = str.split(" ") ; // 按照空格拆分
//        for(String s: result) {
//            System.out.println(s);
//        }

//        String str = "hello world hello bit" ;
//        String[] result = str.split(" ",2) ;
//        for(String s: result) {
//            System.out.println(s);
//        }

//        System.out.println("hello".isEmpty());
//        System.out.println("".isEmpty());
//        System.out.println(new String().isEmpty());
//    }

        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World");
        fun(sb);
        System.out.println(sb);
    }

    public static void fun(StringBuffer temp) {
        temp.append("\n").append("www.bit.com.cn");
    }
}
