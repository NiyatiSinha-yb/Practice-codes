import java.lang.*;
import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        /***Don't change the code here***/
        
        Scanner inp  = new Scanner(System.in);
        int num = inp.nextInt();
        inp.close();
        String res="";
        /*********************************/
        if(num%3==0)
        {
            if(num%5==0)
            {
                res="Good Number";
            }
            else
                res="Bad Number";
        }
        else if(num%5==0)
            res="Poor Number";
        else
            res="-1";
            
        System.out.println(res);
        
        /**Write your code here**/
        
        
        
    }
}
