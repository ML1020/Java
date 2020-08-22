package Important.SingleTon;

//实现单例模式的几个要点
//1.首先要确保全局只有一个类的实例。
//   要保证这一点，至少类的构造器要私有化。
//2.单例的类只能自己创建自己的实例。
//  因为，构造器私有了，但是还要有一个实例，只能自己创建咯！
//3.单例类必须能够提供自己的唯一实例给其他类
//  就是要有一个公共的方法能返回该单例类的唯一实例

//1、饿汉式—静态常量方式（线程安全）
//类加载时就初始化实例，避免了多线程同步问题。天然线程安全。
//public class Singleton {
//    private static Singleton instance = new Singleton();
//    private Singleton(){}
//    public static Singleton getInstance(){
//        return instance;
//    }
//}

//2、饿汉式—静态代码块方式（线程安全）
//   其实就是在上面 静态常量饿汉式 实现上稍微变动了一下，
//   将类的实例化放在了静态代码块中而已。其他没区别。
//public class Singleton {
//    private static Singleton instance;
//    static{
//        instance = new Singleton();
//    }
//    private Singleton(){}
//    public static Singleton getInstance(){
//        return instance;
//    }
//}

//3、懒汉式（线程不安全）
//   这是最基本的实现方式，第一次调用才初始化，实现了懒加载的特性。
//   多线程场景下禁止使用，因为可能会产生多个对象，不再是单例。
//public class Singleton {
//    private static Singleton instance;
//    private Singleton(){}
//    public static Singleton getInstance(){
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

//4、懒汉式（线程安全，方法上加同步锁）
//和上面 懒汉式（线程不安全）实现上唯一不同是：
// 获取实例的getInstance()方法上加了同步锁。
// 保证了多线程场景下的单例。但是效率会有所折损，不过还好。
//public class Singleton {
//    private static Singleton instance;
//    private Singleton(){}
//    public static synchronized Singleton getInstance(){
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

//5、双重校验锁（线程安全，效率高）
//此种实现中不用每次需要获得锁，减少了获取锁和等待的事件。
//注意volatile关键字的使用，保证了各线程对singleton静态实例域修改的可见性。
public class Singleton {
    private volatile static Singleton instance;
    private Singleton(){}
    public static  Singleton getInstance(){
        if (instance == null){
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

//6、静态内部类实现单例（线程安全、效率高）
//这种方式下 Singleton 类被装载了，instance 不一定被初始化。
// 因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，
// 才会显式装载 SingletonHolder 类，从而实例化 instance。
//注意内部类SingletonHolder要用static修饰且其中的静态变量INSTANCE必须是final的。
//public class Singleton {
//    private static class SingletonHolder {
//    private static final Singleton INSTANCE = new Singleton();
//    }
//    private Singleton (){}
//    public static final Singleton getInstance() {
//    return SingletonHolder.INSTANCE;
//    }
//}