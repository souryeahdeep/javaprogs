import java.util.Arrays;
import java.util.Scanner;

public class maxWealth {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr =new int[][]{{1,5},{7,3},{3,5}};
        int wealth=0;
        for(int person=0;person<arr.length;person++){
            int sum=0;
            for(int account=0;account<arr[person].length;account++){
                sum=sum+arr[person][account];
            }
            if(sum>wealth)
                wealth=sum;
        }

        System.out.println(wealth);
    }
}
