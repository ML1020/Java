package Demo;
//
//class Singleton{
//    // 在类的内部可以访问私有结构，所以可以在类的内部产⽣实例化对象
//    private static Singleton instance = new Singleton() ;
//    private Singleton() { // private声明构造
//    }
//    public static Singleton getInstance() {
//        return instance ;
//    }
//    public void print() {
//        System.out.println("Hello World");
//    }
//}
//public class SingletonDemo {
//    public static void main(String[] args) {
//        Singleton singleton = null ; // 声明对象
//        singleton = Singleton.getInstance() ;
//        singleton.print();
//    }
//}

//懒汉模式：类加载时不会创建实例，用的时候才会创建实例
//class Singleton{
//    private static Singleton instance ;
//    private Singleton() { // private声明构造
//    }
//    public static Singleton getInstance() {
//        if (instance==null) { // 表示此时还没有实例化
//            instance = new Singleton() ;
//        }
//        return instance ;
//    }
//    public void print() {
//        System.out.println("Hello World");
//    }
//}
//public class SingletonDemo {
//    public static void main(String[] args) {
//        Singleton singleton = null ; // 声明对象
//        singleton = Singleton.getInstance() ;
//        singleton.print();
//    }
//}

//饿汉模式：
class Singleton{
    // 在类的内部可以访问私有结构，所以可以在类的内部产⽣实例化对象
    private static Singleton INSTANCE = new Singleton() ;
    private Singleton() { // private声明构造
    }
    public static Singleton getInstance() {
        return INSTANCE ;
    }
    public void print() {
        System.out.println("Hello World");
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = null ; // 声明对象
        singleton = Singleton.getInstance() ;
        singleton.print();
    }
}