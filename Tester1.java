package HomeWork;
import java.io.*;
import java.util.Scanner;

public class Tester1 {
    public static void main(String args[]) {   //主方法，程序运行由此进入
        Student students[];    //创建Student类的数组
        StudentClass aClass = new StudentClass("软件0201", 2); //新建一个对象并传入参数
        students = new Student[2];    //设置数组大小
        for (int i = 0; i < 2; i++)
            students[i] = new Student(getAStudent(i + 1));//将对象包含信息依次存入数组中
        aClass.setStudents(students);
        System.out.println(aClass);
        //将学生信息保存到文件stu.ser中。
        try {
            //应用程序中的内容输出至外部文件
            FileOutputStream fo = new FileOutputStream("D:\\stu.ser");
            ObjectOutputStream so = new ObjectOutputStream(fo);
            for (int i = 0; i < 2; i++)
                so.writeObject(students[i]);  //将数组中所包含的内容依次写入
            so.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static Student getAStudent(int i){	//读取信息
        Student studenti;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第" + i + "个学生的信息:");
        System.out.print("学号:");
        String id = scanner.nextLine();
        System.out.print("姓名:");
        String name = scanner.nextLine();
        System.out.print("英语成绩:");
        int eng = scanner.nextInt();
        System.out.print("数学成绩:");
        int math = scanner.nextInt();
        System.out.print("计算机成绩:");
        int comp = scanner.nextInt();
        studenti = new Student(id,name,eng,math,comp);
        return studenti;
    }
}
