package Demo;
//
//abstract class Person{
//    private String name ; // 属性
//    public String getName(){ // 普通⽅法
//        return this.name;
//    }
//    public void setName(String name){
//        this.name = name ;
//    }
//    // {}为⽅法体，所有抽象⽅法上不包含⽅法体
//    public abstract void getPersonInfo() ; //抽象⽅法
//}
//class Student extends Person{
//    public void getPersonInfo(){
//        System.out.println("I am a student");
//    }
//}
//public class AbsractDemo{
//    public static void main(String[] args) {
//        Person per = new Student() ; //实例化⼦类，向上转型
//        per.getPersonInfo() ; //被⼦类所覆写的⽅法
//    }
//}


abstract class A{
    public A(){ //3.调⽤⽗类构造
        this.print() ; //4.调⽤被⼦类覆写的⽅法
    }
    public abstract void print() ;
}
class B extends A{
    private int num = 100 ;
    public B(int num) { //2.调⽤⼦类实例化对象
        super() ; //3.隐含⼀⾏语句，实际要先调⽤⽗类构造
        this.num = num ; //7.为类中属性初始化
    }
    public void print() { //5.此时⼦类对象的属性还没有被初始化
        System.out.println(this.num) ; //6.对应其数据类型的默认值
    }
}
public class AbsractDemo{
    public static void main(String[] args) {
        new B(30) ; //1.实例化⼦类对象
    }
}


