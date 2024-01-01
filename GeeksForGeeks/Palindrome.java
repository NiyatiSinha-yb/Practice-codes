//https://www.geeksforgeeks.org/problems/palindrome0746/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Palindrome

//Time Complexity: O((log n)/2)
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
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        String p=""+n;
        for(int i=0; i<p.length()/2; i++)
        {
            if(p.charAt(i)!=p.charAt(p.length()-i-1))
                return "No";
        }
        return "Yes";
    }
}
