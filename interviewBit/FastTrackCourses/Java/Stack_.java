import java.lang.*;
import java.util.*;

public class Stack_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) //postfix subtraction
        {
            String A = sc.nextLine();
            if (solve(A)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
    public static boolean solve(String A) {
        Stack < Character > s = new Stack < > ();
        char[] expr = A.toCharArray();
        for (int i = 0; i < A.length(); i++) {
            if (expr[i] == '(') {
                // Push the element in the stack
                s.push(expr[i]);
                continue;
            }

            // IF current current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            else if (s.empty())
                return false;

            //if (expr[i] == ')') {
                // Store the top element in a
             else{ 
                char x = s.peek();
                s.pop();
                if (x != '(') {
                    return false;
                }
            }
        }

        // Check Empty Stack
        return (s.empty());
    }
}
