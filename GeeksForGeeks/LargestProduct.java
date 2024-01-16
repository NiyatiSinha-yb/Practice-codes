//Largest product
//https://www.geeksforgeeks.org/problems/largest-product/1?page=1&status=unsolved,attempted&sortBy=difficulty
//Time Complexity: O((n-k)*k)
//Space complexity: O(1)

//{ Driver Code Starts
import java.util.*;
import java.lang.Math;


class Largest_Product_Subarray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[]  = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
				
			
			
			GfG g = new GfG();
			System.out.println(g.findMaxProduct(arr, n , k));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete the function*/
class GfG
{
    long findMaxProduct(int A[], int n, int k)
    {
	// Your code here
	    long prod=1;
	    long maxProd=1;
	    for(int i=0; i<=n-k; i++)
	    {
	        prod=1;
	        for(int j=0; j<k; j++)
	        {
	            prod*=A[i+j];
	            //System.out.print(A[i+j]+" , ");
	        }
	        
	        //System.out.println();
	        //System.out.println(prod);
	        if(maxProd<prod)
	        {
	            maxProd=prod;
	        }
	       
	    }
	    return maxProd;
    }
}
