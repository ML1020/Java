package HomeWork;

public class BoxOfSpace {
    int length,wide,high;
public BoxOfSpace(int length,int wide,int high){
    this.length = length;
    this.wide = wide;
    this.high= high;
}
    public int getR(int length,int wide,int high){
        return length*wide*high; }
    public int getD(int wide,int length){
        return wide*length; }
    public void printA() {
        System.out.println("箱子的长为："+length+"宽为："+wide+"高为："+high);
        System.out.println("这个箱子有多大？"); }
}


//    static int length = 30;
//    static int wide = 10;
//    static int high = 20;