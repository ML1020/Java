package Demo;

class Person{
    public void print(){
        System.out.println("[PRINT]方法" + this);
    }
}

public class thisDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("[MAIN]" + p1);
        p1.print();
        System.out.println("======");
        Person p2 = new Person();
        System.out.println("[MAIN]" + p2);
        p2.print();
    }
}
