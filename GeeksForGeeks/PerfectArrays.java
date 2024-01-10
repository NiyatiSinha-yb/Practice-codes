//Perfect Arrays
//https://www.geeksforgeeks.org/problems/perfect-arrays4645/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n)
//Space complexity: O(1)

//{ Driver Code Starts
/*package whatever //do not write package name here */


import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    if(obj.IsPerfect(arr, n))
		        System.out.println("PERFECT");
		    else
		        System.out.println("NOT PERFECT");
		}
		
	}
}


// } Driver Code Ends


class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        for(int i=0; i<n; i++)
        {
            if(a[i]!=a[n-1-i])
                return false;
        }
        return true;
    }
    
}

