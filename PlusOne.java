package Solution;
//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//(注意：你要防止的是第一个数字是9或者最后一个是9哈！这种情况会有进位滴)
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1;i >= 0;i--){
            if (digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            //1,2,9
            digits[i] = 0;
        }
        //1，9，9
        int[] temp = new int[digits.length+1];
        temp[0] += 1;
        return temp;
    }
}
