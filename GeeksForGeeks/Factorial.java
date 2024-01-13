//Factorial
//https://www.geeksforgeeks.org/problems/factorial5739/1?page=2&difficulty=School,Basic&status=unsolved,attempted&sortBy=submissions
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.factorial(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static long factorial(int N){
        // code here
        long fact=1;
        for(long i=1; i<=N; i++)
        {
            fact*=i;
        }
        return fact;
    }
}
