//Power of Pow | Even Number
//https://www.geeksforgeeks.org/problems/power-of-pow-even-number5440/1?page=2&difficulty=School&status=unsolved&sortBy=submissions
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
            long n = Long.parseLong(br.readLine().trim());            
            Solution ob = new Solution();
            long ans = ob.sum_of_square_evenNumbers(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long sum_of_square_evenNumbers(long n)
    {
        // Code here
        //sum_of_square_evenNumbers=[2n(n + 1)(2n + 1)] / 3
        long deno=3;
        long res= 2*n*(n+1)*(n*2+1)/deno;
        return res;
    }
}
