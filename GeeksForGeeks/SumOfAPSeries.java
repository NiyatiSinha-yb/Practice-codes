//Sum of AP series
//https://www.geeksforgeeks.org/problems/sum-of-ap-series4512/1?page=4&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine();
            String[] S = s.split(" ");
            long n = Long.parseLong(S[0]);
            Long a = Long.parseLong(S[1]);
            Long d = Long.parseLong(S[2]);
            Solution ob = new Solution();
            Long ans = ob.sum_of_ap(n, a, d);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long sum_of_ap(long n, long a, long d)
    {
        // Code here
        long deno=2;
        long res= ((2*a+(n-1)*d)*(n))/deno;
        return res;
    }
}
