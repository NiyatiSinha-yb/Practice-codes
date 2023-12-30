//SimpleInterest.java
//https://www.geeksforgeeks.org/problems/simple-interest3457/1?page=4&difficulty=School&sortBy=submissions
//Time Complexity: O(1)
//Space Complexity: O(1)

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int P = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            int T = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            out.println(String.format("%.2f",ob.simpleInterest(P, R, T)));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    double simpleInterest(int P, int R, int T) {
        // code here
        double n=1;
        double res= n*P*R*T/100;
        return res;
    }
}
