import java.util.ArrayList;
import java.util.Scanner;

public class SearchMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size");
        int n=sc.nextInt();int i=n;
        ArrayList<Integer> arr=new ArrayList<>(n);
        System.out.println("Enter the Elements");
        while(n!=0){
            arr.add(sc.nextInt());
            n--;
        }
        int mini=0;
        if(i>0) {
            mini = minEle(arr, i);
            System.out.println("The Minimum Number in the array : "+mini);
        }
        else {
            System.out.println("No elements");

        }


    }

    static int minEle(ArrayList<Integer> arr,int n) {
        int min=arr.get(0);int i=1;
        while(i!=n){
            if(arr.get(i)<min)
                min=arr.get(i);

            i++;
        }
        return min;
    }
}
