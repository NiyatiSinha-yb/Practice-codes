//Maximum money
//https://www.geeksforgeeks.org/problems/maximum-money2855/1?page=2&difficulty=School,Basic&status=unsolved,attempted&sortBy=accuracy
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
            String St[] = read.readLine().split(" ");
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);

            Solution ob = new Solution();
            System.out.println(ob.maximizeMoney(N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maximizeMoney(int n , int k) {
        // code here
        if(n%2==0)
        {
            return (n*k)/2;
        }
        return ((n+1)*k)/2;
    }
};
