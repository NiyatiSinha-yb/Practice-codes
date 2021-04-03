import java.lang.*;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        
        /*Dont't touch the code in this block*/
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.nextLine();
        inp.close();
        System.out.println(add(a,b));
        System.out.println(multiply(a,b));
        /*******************************************/
    }
    static int add (int a , int b){
        return a+b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    
    //Your code goes here
    
    
}
