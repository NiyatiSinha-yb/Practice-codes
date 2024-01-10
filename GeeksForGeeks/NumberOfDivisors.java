//Number of divisors
//https://www.geeksforgeeks.org/problems/number-of-divisors1631/1?page=2&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(Math.sqrt(n))
//Space complexity: O(1)

//{ Driver Code Starts
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
            System.out.println(ob.count_divisors(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static long count_divisors(int n){
        // code here
        int divisors=0; //As n will always be a divisor of itself
	    for(int i=1; i*i<=n; i++)
	    {
	        if(n%i==0)
	        {
	            int otherDiv=n/i;
	           // System.out.println("Divisor 1: "+i);
	           // System.out.println("Divisor 1: "+otherDiv);
	            if(i==n/i) //both divisors are equal
	            {
		            if(i%3==0)
		                divisors++;
	            }
	            else{
	                if(i%3==0)
	                    divisors++;
	                if(otherDiv%3==0)
	                    divisors++;
	            }
	        }
	    }
	    return divisors;
    }
}
