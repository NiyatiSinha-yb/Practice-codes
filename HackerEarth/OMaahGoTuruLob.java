/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.Scanner; 

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class OMaahGoTuruLob{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String name="";
        for (int i=0; i<n; i++)
        //while( sc.hasnextLine())
        {
            name = sc.next();
            
            if((name.indexOf('a')!=-1 && name.indexOf('e')!=-1 && name.indexOf('i')!=-1 && name.indexOf('o')!=-1 && name.indexOf('u')!=-1) || (name.indexOf('A')!=-1 && name.indexOf('E')!=-1 && name.indexOf('I')!=-1 && name.indexOf('O')!=-1 && name.indexOf('U')!=-1))
                System.out.println("lovely string");
            else
                System.out.println("ugly string");
            
        }
        
    }
}
