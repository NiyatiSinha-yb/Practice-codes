//Sum of odd and even elements
//https://www.geeksforgeeks.org/problems/sum-of-odd-and-even-elements3033/1?page=2&difficulty=School&status=unsolved&sortBy=accuracy

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
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.find_sum(n);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] find_sum(int N)
    {
        // Code here
        int res[]= new int [2];
        int odd=N/2;
        int even=N/2;
        if(N%2==1)
        {
            odd++;
        }
        res[0]=odd*odd;
        res[1]=even*(even+1);
        return res;
    }
}
