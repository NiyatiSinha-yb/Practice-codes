import java.lang.*;
import java.util.*;

public class Stacks_ {
    static int checkParanthesis(String input)
    {
        //Scanner sc = new Scanner(System.in);
        ArrayList <Character> ob = new ArrayList<Character>();
        //String input= sc.nextLine();
       // sc.close();
        for(int i=0;  i<input.length(); i++){
            if(input.charAt(i)=='(')
            {
                ob.add('(');
            }
            else
            {
                if(ob.size()!=0)
                    ob.remove(ob.size()-1);
                else
                    return 0;
            }
        }
            if(ob.size()==0)
                return 1;
            else
                return 0;
        
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s =new Scanner (System.in);
        int loop=s.nextInt();
        s.nextLine();
        
        for(int i=0;i<loop;i++)
            System.out.println(checkParanthesis(s.nextLine()));
        
        
    }
}
