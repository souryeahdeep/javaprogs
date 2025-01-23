import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the Size: ");
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>(n);
        System.out.println("Enter the Elements");
        while(n!=0){
            arr.add(sc.nextInt());
            n--;
        }

        System.out.println("Enter the Number to Search");
        int target=sc.nextInt();
        int check=linearSearch(arr,target);
        if(check==-1 || arr.isEmpty()){
            System.out.print("Sorry bro! not present");
        }else System.out.print("Found at "+check);
    }

    static int linearSearch(ArrayList<Integer> arr, int target) {
        int c=-1;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==target){
                c=i;
                break;
            }
        }
        return c;
    }
}
