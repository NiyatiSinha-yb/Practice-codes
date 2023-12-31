//Reversedigits.java
//https://www.geeksforgeeks.org/problems/reverse-digit0316/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Time Complexity: O(log n)
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
            long ans = ob.reverse_digit(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        long p=n;
        long rev=0;
        long rem=0;
        while(p!=0)
        {
            rem=p%10;
            p=p/10;
            rev=rev*10+rem;
        }
        return rev;
    }
}
