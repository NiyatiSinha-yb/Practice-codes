//Full Prime
//https://www.geeksforgeeks.org/problems/full-prime2659/1?page=2&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(sqrt(n))
//Space complexity: O(1)
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.fullPrime(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int checkPrimeNum(int N)
    {
        if(N<=1)
            return 0;
        for(int i=2; i<=(int)Math.sqrt(N); i++)
        {
            if(N%i==0)
            {
                return 0; //Num is not prime
            }
        }
        return 1; //Num is prime
    }
	static int fullPrime(int N){
	    //code here
	    int n=N;
	    int rem=0;
	    if(checkPrimeNum(N)==0)
	        return 0;
	    while (n!=0)
	    {
	        rem=n%10;
	        n=n/10;
	        if(checkPrimeNum(rem)==0)
	            return 0;
	    }
	    return 1;
	    
	    
	}
}
