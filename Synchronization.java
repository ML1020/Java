package Demo;

public class Synchronization {
    /**
     * 对象锁
     */
    // 对象锁：形式1(方法锁)
    public synchronized void Method1() {
        System.out.println("我是对象锁也是方法锁");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    // 对象锁：形式2（代码块形式）
    public void Method2() {
        synchronized (this) {
            System.out.println("我是对象锁");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 方法锁（即对象锁中的形式1）
     */
    public synchronized void Method11() {
        System.out.println("我是对象锁也是方法锁");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

    /**
     * 类锁
     */
//    public class Synchronization {
//        // 类锁：形式1 ：锁静态方法
//        public static synchronized void Method1() {
//            System.out.println("我是类锁一号");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        // 类锁：形式2 ：锁静态代码块
//        public void Method2() {
//            synchronized (Test.class) {
//                System.out.println("我是类锁二号");
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//        }
//    }