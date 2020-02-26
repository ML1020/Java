package Important;

public class Find {
    public static boolean Find1(int target, int [][] array) {
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[0].length;j++){
                if (target == array[i][j]){
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int target = 7;
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        Find1(target,array);
    }
}
