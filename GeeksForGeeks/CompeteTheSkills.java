//Compete the skills
//https://www.geeksforgeeks.org/problems/compete-the-skills5807/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static long ca=0, cb=0;
    
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = 3;
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            obj.scores(a, b);
            System.out.println(ca + " " + cb);
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {

    public void scores(long a[], long b[]) {
        // store the answer as
        GFG.ca=0;
        GFG.cb=0;
        // Your code goes here
        //System.out.println(GFG.ca+", "+GFG.cb);
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>b[i])
                GFG.ca++;
            else if(a[i]<b[i])
                GFG.cb++;
            //System.out.println(GFG.ca+", "+GFG.cb);
        }
    }
}
