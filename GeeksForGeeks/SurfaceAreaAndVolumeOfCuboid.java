//Surface Area and Volume of Cuboid
//https://www.geeksforgeeks.org/problems/surface-area-and-volume-of-cuboid0522/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(n)

//{ Driver Code Starts
//Initial Template for Java

]//{ Driver Code Starts
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
            String s = br.readLine().trim();
            String S[] = s.split(" ");
            int l = Integer.parseInt(S[0]);
            int b = Integer.parseInt(S[1]);
            int h = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            long[] ans = ob.find(l, b, h);
            for(int i = 0; i < ans.length; i++)System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long[] find(int l, int b, int h)
    {
        // code here
        long one=1;
        long res[]= new long[2];
        res[0]=one*2*(one*l*b+one*b*h+one*h*l);
        res[1]=one*l*b*h;
        return res;
    }
    
}
