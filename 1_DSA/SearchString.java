import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        System.out.println("Enter the Character to Search");
        char ch=sc.next().charAt(0);
        int check=searchChar(str,ch);
        if(check==-1)
            System.out.println("Not found");
        else
        System.out.println("Found at "+check);
    }

     static int searchChar(String str, char ch) {
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i))
                return i;
        }
        return -1;
    }
}
