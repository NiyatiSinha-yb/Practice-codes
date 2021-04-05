import java.lang.*;
import java.util.*;

public class SubString {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        //considering user always inputs valid index range 
        System.out.println(a.substring(sc.nextInt(),sc.nextInt()+1));
        sc.close();
        
    }
}
