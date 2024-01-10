//nPr
//https://www.geeksforgeeks.org/problems/npr4253/1?page=2&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            Long n = Long.parseLong(a[0]);
            Long r = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nPr(n, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long fact(long x)
    {
        long factorial=1;
        for(int i=1; i<=x; i++)
        {
            factorial*=i;
        }
        return factorial;
    }
    static long nPr(long n, long r){
        // code here
        return fact(n)/(fact(n-r));
        
    }
}
