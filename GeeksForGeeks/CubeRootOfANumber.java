//Cube root of a number
//https://www.geeksforgeeks.org/problems/cube-root-of-a-number0915/1?page=2&difficulty=School&status=unsolved&sortBy=accuracy
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
            System.out.println(ob.cubeRoot(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int cubeRoot(int N) {
        // code here
        int root= (int)Math.cbrt(N);
        return root;
    }
};
