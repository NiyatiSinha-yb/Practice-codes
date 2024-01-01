//Find Index
//https://www.geeksforgeeks.org/problems/find-index4752/1?page=1&difficulty=School&status=unsolved&sortBy=submissions

//Time Complexity: O(n)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        for(int i=0; i<N; i++)
        {
            if(a[i]==key)
            {
                if(arr[0]==-1)
                {
                    arr[0]=i;
                    arr[1]=i;
                }
                else
                    arr[1]=i;
            }
        }
        return arr;
    } 
}
