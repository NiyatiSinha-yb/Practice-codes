//Find n-th term of series 1, 3, 6, 10, 15, 21
//https://www.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-215506/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(1)
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
            System.out.println(ob.findNthTerm(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findNthTerm(int N) {
        // code here
        //diffrences are 2,3,4,.....
        //differences are in AP, calc the sum of n-1 difference T= 0.5*(n-1)*(2a+((n-1)-1)d) , a=2
        //Tn=0.5*(n-1)*(4+(n-2)*1) = 0.5*(n-1)*(2+n)
        //Nth term of sequence= 1st term + STn
        //1+(0.5*(n-1)*(2+n))
        return (int)(1+(0.5*(N-1)*(2+N)));
    }
};
