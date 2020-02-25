//package Demo;
//
//    interface IMessage{
//        public static final String MSG = "I am a biter" ; // 全局常量
//        public abstract void print() ; // 抽象⽅法
//    }
//    interface INews {
//        public abstract String getNews() ;
//    }
//    class MessageImpl implements IMessage,INews {
//        public void print() {
//            System.out.println(IMessage.MSG) ;
//        }
//        public String getNews(){
//            return IMessage.MSG ; // 访问常量都建议加上类名称
//        }
//    }
//    public class InterfaceDemo {
//        public static void main(String[] args) {
//            IMessage m = new MessageImpl(); //⼦类向上转型,为⽗接⼝实例化对象
//            m.print(); // 调⽤被⼦类覆写过的⽅法
//            INews n = (INews) m;
//            System.out.println(n.getNews());
//        }
//    }
