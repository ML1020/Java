package HomeWork;

import java.io.*;

public class Student implements Serializable {
    //Student类实现Serializable接口，使Student类的对象可以被序列化
    private String id;		//学号
    private String name;		//姓名
    private int eng;		//英语成绩
    private int math;	             //数学成绩
    private int comp;                     //计算机成绩
    private int sum;		//总成绩
    public Student(String id,String name,int eng,int math,int comp){  //有参构造函数
        this.id=id;             //this表示当前对象，即将指定的id赋给这个学生对象
        this.name=name;     //前面的id是上面声明的，后面的id是传进来的
        this.eng=eng;
        this.math=math;
        this.comp=comp;
        sum();            //计算总成绩，sum方法
    }
    public Student(Student s){	     //有参构造函数，方法的重载
        this.id=s.id;  //this表示当前对象，即将指定的id赋给这个学生对象
        this.name=new String(s.name);
        this.eng=s.eng;
        this.math=s.math;
        this.comp=s.comp;
        sum();            //计算总成绩
    }

    //由于属性是private私有的，
    //所以必须带用getter()方法来获取或者setter方法来设定其他值

    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEng(int eng){
        this.eng=eng;
        sum();            //计算总成绩
    }
    public void setMath(int math){
        this.math=math;
        sum();            //计算总成绩
    }
    public void setComp(int comp){
        this.comp=comp;
        sum();            //计算总成绩
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getEng(){
        return eng;
    }
    public int getMath(){
        return math;
    }
    public int getComp(){
        return comp;
    }
    public int getSum(){
        return sum;
    }
    void sum(){
        this.sum=eng+math+comp;
    }
    //重写同String()方法。它是Object里已有的方法，而所有类都是继承Object类， 所以要想输出输出自己想要的文字信息，就可以重写toString()方法
    public String toString(){
        return getId() + "\t\t"+getName() + "\t\t"+getEng() + "\t\t"+getMath() +"\t\t"+getComp() + "\t\t"+getSum();
    }

    //重写同equals()方法。equals重写后可比较的是对象的属性。
    public boolean equals(Object x) {
        if (this.getClass() != x.getClass()) return false;     //比较类型
        Student b = (Student) x;
        return (this.getId().equals(b.getId()));      //比较id值
    }

    //比较成绩大小,当前对象成绩比参数对象成绩大时返回1,相等时返回0,其它返回-1.
    public int compare(Student A){
        if(this.getSum()>A.getSum()) return 1;
        else if(this.getSum()==A.getSum()) return 0;
        else return -1;
    }
}


