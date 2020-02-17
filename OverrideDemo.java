package Demo;

//public class OverrideDemo {
//    public static class Father {
//        public void print() {
//            System.out.println("sunny day");
//        }
//    }
//    public static class Kid extends Father {
//    }
//    public static void main(String args[]) {
//        Kid kid = new Kid();
//        kid.print(); // 方法从父类继承而来
//    }
//}

//public class OverrideDemo {
//    public static class Father {
//        public void print() {
//            System.out.println("sunny day");
//        }
//    }
//    public static class Kid extends Father {
//        public void print() {
//            System.out.println("艳阳天");
//        }
//    }
//    public static void main(String args[]) {
//        Kid kid = new Kid();
//        kid.print(); // 方法从父类继承而来
//    }
//}

public class OverrideDemo {
    public static class Father {
        public void print() {
            System.out.println("sunny day");
        }
        public void A(){
            System.out.println("af");
        }
    }
    public static class Kid extends Father {
        public void print() {
            this.A();
            super.print();
            System.out.println("艳阳天");
        }
        public void A(){
            System.out.println("ac");
        }
    }
    public static void main(String args[]) {
        Kid kid = new Kid();
        kid.print(); // 方法从父类继承而来
    }
}