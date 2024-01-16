//Nth Fibonacci Number
//https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1?page=2&difficulty=School,Basic,Easy&status=unsolved,attempted&sortBy=submissions
//Time Complexity: O(n)
//Space complexity: O(1)


//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        // code here
        long a=0;
        long b=1;
        long temp;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n>1)
        {
            for(int i=2; i<=n; i++)
            {
                temp=(a+b)%1000000007;
                a=b;
                b=temp;
            }
            return (int) (b);
        }
        return -1;
        
    }
}
