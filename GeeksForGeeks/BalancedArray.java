//Balanced Array
//https://www.geeksforgeeks.org/problems/balanced-array07200720/1?page=2&difficulty=School,Basic&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n/2)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
        long leftSum=0;
        long rightSum=0;
        
        for(int i=0; i<n/2; i++)
        {
            leftSum+=a[i];
            rightSum+=a[n-i-1];
        }
        long diff= leftSum>rightSum? leftSum-rightSum: rightSum-leftSum;
        return diff;

    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            
            long ans=ob.minValueToBalance(a,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends
