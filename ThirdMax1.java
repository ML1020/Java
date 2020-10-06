package Solution;

public class ThirdMax1 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        thirdMax(arr);
    }
    //找出第三大的数
    //没有的话找出最大的数
    //找出三个变量保存三个数
    public static int thirdMax (int[] nums) {
        int[] result = {'*','*','*'};  //从小到大
        //min = result[0]; mid = result[1];  max = result[2];
        for (int i = 0;i < nums.length;i++) {
            for (int j = 0; j < 3; j++) {
                if (result[j] == '*') {
                    result[j] = nums[i];
                    break;
                }
                if (result[j] > nums[i]) {
                    for (int k = 2; k < j; k--) {
                        result[k] = result[k - 1];
                    }
                    result[j] = nums[i];
                }
                if (result[j] == nums[i]) {
                    break;
                }
            }
        }
            if (result[2] == '*'){
                System.out.println(result[0]);
                return result[0];
            }else {
                System.out.println(result[2]);
                return result[2];
            }
        }
}
