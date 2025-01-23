import java.util.Arrays;
import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Row and Column");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }

        }
        System.out.println("Enter the Number to Search");
        int target=sc.nextInt();
        int[] check=search2d(arr,target);
        System.out.println(Arrays.toString(check));
    }
    static int[] search2d(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target)
                    return new int[]{i, j};
            }

        }
       return new int[]{-1,-1};

    }
}
