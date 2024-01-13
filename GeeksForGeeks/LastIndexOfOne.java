//Last index of One
//https://www.geeksforgeeks.org/problems/last-index-of-15847/1?page=2&difficulty=School,Basic&status=unsolved,attempted&sortBy=submissions
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.lastIndex( s));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int lastIndex( String s) {
        
        for(int i=s.length()-1; i>=0; i--)
        {
            if(s.charAt(i)=='1')
                return i;
        }
        return -1;
    }
}
