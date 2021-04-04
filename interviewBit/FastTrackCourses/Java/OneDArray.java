import java.lang.*;
import java.util.*;

public class OneDArray {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int len=Integer.parseInt(sc.nextLine());
        int arr[]=new int[len];
        //String reverse="";
        for(int i=0;i<len; i++){
            arr[i]=Integer.parseInt(sc.nextLine());
           // reverse=reverse+String.valueOf(arr[i]);
        }
        sc.close();
        for(int i=len-1;i>=0; i--)
            System.out.println(arr[i]);
        //System.out.println(reverse);
        
        
    }
}
