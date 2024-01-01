//https://www.geeksforgeeks.org/problems/sum-of-digits1742/1?page=2&difficulty=School&status=unsolved&sortBy=submissions
//Sum Of Digits
//Time Complexity: O(log n)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfDigits(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int sumOfDigits(int N) {
        // code here
        int n=N;
        int rem=0;
        int sum=0;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            sum+=rem;
        }
        return sum;
    }
}
       
