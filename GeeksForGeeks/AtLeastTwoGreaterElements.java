//At least two greater elements
//https://www.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(n log n)
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
            
            long n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            long answer[] = obj.findElements( a, n);
            long sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
            output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public long[] findElements( long a[], long n)
    {
        // Your code goes here
        long res[]=new long[(int)(n-2)];
        Arrays.sort(a);
        for(int i=0; i<n-2; i++)
        {
            res[i]=a[i];
        }
        return res;
    }
}
