package HomeWork;

public class GetBoxSpace extends BoxOfSpace {
    public GetBoxSpace(int length, int wide, int high) {
        super(length, wide, high); }
    public void printB(){
        super.printA();
        System.out.println("箱子的体积为："+ super.getR(length,wide,high));
        System.out.println("箱子的底面积为："+super.getD(wide,length));
        if (super.getR(length,wide,high) >= 5000){
            System.out.println("太重了抬不动");
        }else {
            System.out.println("还好可以抬动"); }
    }
    public static void main(String[] args) {
        GetBoxSpace b = new GetBoxSpace(30,10,20);
        b.printB(); }
}


//        BoxOfSpace a = new BoxOfSpace(30,10,20);
//        a.printA();