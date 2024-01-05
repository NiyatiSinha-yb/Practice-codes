//Power of Pow | Odd Numbers
//https://www.geeksforgeeks.org/problems/perfect-number3759/1?page=2&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(n)
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
            long ans = ob.sum_of_square_oddNumbers(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long sum_of_square_oddNumbers(long n)
    {
        // Code here
        long sum=0;
        long no=1;
        for(long i=0; i<n; i++){
            sum+=(long)Math.pow(no,2);
            //System.out.println("Sum="+sum);
            no=no+2;
        }
        return sum;
    }
}
