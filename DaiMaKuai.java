package Demo;

class Student{
    private String name;
    private int age;
    //构造函数
    public Student(){
        System.out.println("we are winner");
    }
    //构造代码块（实例代码块）
    {
        this.age = 20;
        this.name = "jack";
        System.out.println("I am the best");
    }

    public void show(){
        System.out.println("name:" + name + " age:" + age);
    }
}

public class DaiMaKuai {
    public static void main(String[] args) {
        Student student = new Student();
        student.show();
    }
}
