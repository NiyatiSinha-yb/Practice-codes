//Print 1 to n without using loops
//https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Time Complexity: O(N)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.printTillN(N);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void rec(int n)
    {
        if(n==0)
            return;
        rec(n-1);
        if(n>0)
            System.out.print(n+" ");
        
    }
    static void printTillN(int N){
        // code here
        rec(N);
    }
}
