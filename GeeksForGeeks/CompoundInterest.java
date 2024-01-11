//Compound Interest
//https://www.geeksforgeeks.org/problems/compound-interest0235/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(log n)
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
            String S[] = read.readLine().split(" ");
            int P = Integer.parseInt(S[0]);
            int T = Integer.parseInt(S[1]);
            int N = Integer.parseInt(S[2]);
            int R = Integer.parseInt(S[3]);

            Solution ob = new Solution();
            System.out.println(ob.getCompundInterest(P,T,N,R));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int getCompundInterest(int P , int T , int N , int R) {
        // code here
        //P(1+r/100n)^nt
        double val=(1.0+(0.01*R)/N);
        //System.out.println(val);
        val=Math.pow(val,N*T);
        //System.out.println(val);
        val= Math.floor(P*val);
        //System.out.println(val);
        return (int)val;
    }
};
