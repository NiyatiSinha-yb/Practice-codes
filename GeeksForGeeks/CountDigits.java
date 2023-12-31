//https://www.geeksforgeeks.org/problems/count-digits5716/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Count Digits
//Time complexity: O(N)
//Space Complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java


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
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    public static int checkDivisibility(int n, int p)
    {
        if(n%p==0)
            return 1;
        return 0;
    }
    static int evenlyDivides(int N){
        // code here
        int copy=N;
        int rem=0;
        int count=0;
        while(copy!=0)
        {
            rem=copy%10;
            copy=copy/10;
            if(rem!=0)
                if(checkDivisibility(N,rem)==1)
                {
                    count++;
                }
        }
        return count;
    }
}
