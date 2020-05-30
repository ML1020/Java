package Demo.ThreadDemo;

public class FactorialThreadTester {
    public static void main(String[] args) {
        System.out.println("main thread starts");
        FactorialThread factorialThread = new FactorialThread(10);
        factorialThread.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread ends");
    }
    static class FactorialThread extends Thread{
        private int num;
        public FactorialThread(int num){
            this.num = num;
        }
        @Override
        public void run(){
            int i = num;
            int result = 1;
            System.out.println("new Thread started");
            while (i > 0){
                result = result*i;
                i = i-1;
            }
            System.out.println("The factorial of "+num+" is "+result);
            System.out.println("new Thread ends");
        }
    }
}