package Demo.ThreadDemo;

public class ThreadSleepTester {
    public static void main(String[] args) {
        //创建并命名每个线程
        TestThread thread1 = new TestThread("thread1");
        TestThread thread2 = new TestThread("thread2");
        TestThread thread3 = new TestThread("thread3");
        System.out.println("Starting threads");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Threads started,main end\n");
    }
    static class TestThread extends Thread{
        private int sleeptime;
        public TestThread(String name){  //构造函数
            super(name);  //调用父类的构造函数为线程命名
            sleeptime = (int)(Math.random()*6000);  //获得随即休息毫秒数
        }
        @Override
        //Thread的子类应该从写此方法，内容应为该线程应执行的任务
        public void run(){
            System.out.println(getName()+"going to sleep for "+sleeptime);
            try {
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+" finished");
        }
    }
}
