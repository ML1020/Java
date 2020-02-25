package Demo;
//
//interface IMessage {
//    public void print() ;
//}
//abstract class News {
//    // 抽象类中⽅法前⾯的abstract不能省略，否则就是普通⽅法
//    public abstract void getNews() ;
//}
//class MessageImpl extends News implements IMessage {
//    public void print() {
//        System.out.println("I am a biter") ;
//    }
//    public void getNews() {
//        System.out.println("I am News") ;
//    }
//}
//public class InterfaceDemo1 {
//    public static void main(String[] args) {
//        IMessage m = new MessageImpl() ;
//        m.print() ;
//// MessageImpl是抽象类和接⼝的共同⼦类
//        News news = (News) m ;
//        news.getNews() ;
//    }
//}

interface IMessage {
    public void print() ;
}
abstract class News implements IMessage{
    //News为抽象类，可以不实现IMessage中的抽象⽅法
// 抽象类中⽅法前⾯的abstract不能省略，否则就是普通⽅法
    public abstract void getNews() ;
}
class MessageImpl extends News {
    public void print() {
        System.out.println("I am a biter") ;
    }
    public void getNews() {
        System.out.println("I am News") ;
    }
}
public class InterfaceDemo1{
    public static void main(String[] args) {
        IMessage m = new MessageImpl() ;
        m.print() ;
// MessageImpl是抽象类和接⼝的共同⼦类
        News news = (News) m ;
        news.getNews() ;
    }
}