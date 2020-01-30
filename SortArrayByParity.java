package Solution;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int j = 0;
        int k = A.length-1;
        for (int i = 0;i < A.length;i++){
            if (A[i]%2 == 0){
                result[j] = A[i];
                j++;
            }else if (A[i]%2 != 0){
                result[k] = A[i];
                k--;
            }
        }
        for (int i = 0;i < result.length;i++){
            System.out.println(result[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] B = {3,1,2,4};
        sortArrayByParity(B);

    }
}
