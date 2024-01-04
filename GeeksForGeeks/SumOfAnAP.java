//Sum of an AP
//https://www.geeksforgeeks.org/problems/sum-of-an-ap1025/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
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
            int n = Integer.parseInt(S[0]);
            int a = Integer.parseInt(S[1]);
            int d = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            int ans = ob.sum_of_ap(n, a, d);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int sum_of_ap(int n, int a, int d)
    {
        // Code here
        //Sum of first n terms of an AP= 0.5*n*(2*a+(n-1)*d)
        return (int)(0.5*n*((2*a)+((n-1)*d)));
    }
}
