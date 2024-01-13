//Third largest element
//https://www.geeksforgeeks.org/problems/third-largest-element/1?page=2&difficulty=School,Basic&status=unsolved,attempted&sortBy=submissions
//Time Complexity: O(n)
//Space complexity: O(1)


//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    
	    
	    if(n<3)
	    {
	        return -1;
	    }
	    
	    
	    int max=a[0]>a[1]?(a[0]>a[2]?a[0]:a[2]):(a[1]>a[2]?a[1]:a[2]);
	    int third_max=a[0]<a[1]?(a[0]<a[2]?a[0]:a[2]):(a[1]<a[2]?a[1]:a[2]);
	    int second_max=a[0]+a[1]+a[2]-max-third_max;
	    
	    //System.out.println(max+", "+second_max+", "+third_max);
	    
	    if(n>3)
	    {
	        for(int i=3; i<n; i++)
	        {
	            if(max<a[i])
	            {
	                
	                third_max=second_max;
	                second_max=max;
	                max=a[i];
	                //System.out.println(max+", "+second_max+", "+third_max);
	            }
	            else if(second_max<a[i])
	            {
	                
	                third_max=second_max;
	                second_max=a[i];
	                //System.out.println(max+", "+second_max+", "+third_max);
	            }
	            else if(third_max<a[i])
	            {
	                
	                third_max=a[i];
	                //System.out.println(max+", "+second_max+", "+third_max);
	            }
	        }
	    }
	    return third_max;
    }
}
