package Solution;

//无缓存交换AB
public class exchangeAB {
  public int[] exchangeAB1(int[] AB) {
        // a^b^b=a
        //^ 异或运算，相同为0 不同为 1，
        //AB ={1,2};
      //0001
      //0010
      //0011
      //0010
      //0001
        AB[0]=AB[0]^AB[1];//AB[0]=3
        AB[1]=AB[0]^AB[1];//AB[1]=1,此时为原AB[0]的值，赋给AB[1]
        AB[0]=AB[0]^AB[1];//AB[0]=2
        return AB;
    }

    public int[] exchangeAB2(int[] AB) {
        // write code here
        AB[0] = AB[0] + AB[1];
        AB[1] = AB[0] - AB[1];
        AB[0] = AB[0] - AB[1];
        return AB;
    }
}
