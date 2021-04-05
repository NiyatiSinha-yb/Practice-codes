import java.lang.*;
import java.util.*;

public class Deque {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner (System.in);
        Deque<Integer> ob= new ArrayDeque<>();
        int loop=sc.nextInt();
        for(int i=0; i< loop; i++)
        {
            int a= sc.nextInt();
            int b= sc.nextInt();
            switch(a)
            {
                case 1: ob.offerLast(b);
                        break;
                case 2: ob.offerFirst(b);
                        break;
                case 3:if(ob.peekFirst()==null)
                            System.out.println("-1");
                        else
                            System.out.println(ob.peekFirst());
                        break;
                case 4: if(ob.peekLast()==null)
                            System.out.println("-1");
                        else
                            System.out.println(ob.peekLast());
                        break;
                case 5: ob.pollFirst();
                        break;
                case 6: ob.pollLast();
                        break;
                            
            }
        }
    }
}
