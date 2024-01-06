//Multiply Array
//https://www.geeksforgeeks.org/problems/multiply-array-1658312632/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(n)
//Space complexity: O(1)

//{ Driver Code Starts
import java.util.*;

class GFG {
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n+5];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            System.out.println(obj.product(arr, n));
        }
	}
}

// } Driver Code Ends



class Solution {

    public static int product(int arr[],int n)
    {
        int prod=1;
        for(int i=0; i<n; i++)
        {
            prod*=arr[i];
        }
        return prod;
    }
}
