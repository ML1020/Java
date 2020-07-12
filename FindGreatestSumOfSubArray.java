package Solution;

//求数组最大连续子序列的和
//{6,-3,-2,7,-15,1,2,2}
public class FindGreatestSumOfSubArray {
    public static int findGreatestSumOfSubArray(int[] array) {
        int ans = Integer.MIN_VALUE;
        for(int i=1; i<array.length+1; i++){
            if(array.length - i >0){
                for(int j=0; j<array.length-i; j++){
                    int sum = 0;
                    for(int k = j; k<j+i; k++){
                        sum += array[k];
                    }
                    if(sum>ans)
                        ans = sum;
                }
            }else{
                int sum = 0;
                for(int j = 0; j<array.length; j++){
                    sum += array[j];
                }
                if(sum >ans)
                    ans = sum;
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6,-3,-2,7,-15,1,2,2};
        findGreatestSumOfSubArray(arr);
    }
}
