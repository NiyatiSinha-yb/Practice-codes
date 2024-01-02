//https://www.geeksforgeeks.org/problems/fascinating-number3751/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Fascinating Number
//Time Complexity: O(1)
//Space Complexity: O(1)

//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        int digit[]=new int[9];
        // code here
        String num=""+n;
        num+=2*n;
        num+=3*n;
        //System.out.println(num);
        if(num.length()!=9)
            return false;
        for(char i='1'; i<='9'; i++)
        {
            //System.out.println(i);
            if(num.indexOf(i)==-1) 
            {
                //System.out.println("first index");
                return false;
            }
            if(num.indexOf(i)!=num.lastIndexOf(i))
            {
                //System.out.println("first index!=last index");
                return false;
            }
        }
        
        return true;
        
    }
}
