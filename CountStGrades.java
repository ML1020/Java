package Solution;

import java.util.Scanner;

public class CountStGrades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int count = 0;
            for(int j = 0;j < arr.length;j++){
                if(x == arr[j]){
                    count++;
                }
                continue;
            }
            System.out.println(count);
        }
    }
}
