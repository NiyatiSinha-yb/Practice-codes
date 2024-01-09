//Max Min
//https://www.geeksforgeeks.org/problems/max-min/1?page=1&difficulty=School,Basic&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n)
//Space complexity: O(1)
//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<N; i++)
        {
            if(A[i]<min)
                min=A[i];
            if(A[i]>max)
                max=A[i];
        }
        //System.out.println(min+","+ max);
        return min+max;
    }
}
