import java.util.ArrayList;
import java.util.Scanner;

public class SearchRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the Array");
        ArrayList<Integer> arr=new ArrayList<>(n);
        System.out.println("Enter the Elements");
        while(n!=0){
            arr.add(sc.nextInt());
            n--;
        }
        System.out.println("Enter the Range");
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("Enter the Number to Search");
        int target=sc.nextInt();
        int check= searchRange(arr,start,end,target);
        if(check==-1||arr.isEmpty())
            System.out.println("Not Found");
        else System.out.println("Found at "+check);
    }

    static int searchRange(ArrayList<Integer> arr, int start, int end, int target) {
        while(start!=end){
            if(arr.get(start)==target)
                return start;
            start++;
        }
        return -1;
    }
}
