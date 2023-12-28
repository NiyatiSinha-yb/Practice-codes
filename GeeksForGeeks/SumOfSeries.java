//SumOfSeries.java
//https://www.geeksforgeeks.org/problems/sum-of-series2811/1?page=1&difficulty=School&sortBy=submissions
//Time Complexity: O(1)
//Space Complexity: O(1)

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().seriesSum(n);

            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        long longOne=1;
        long sum=(longOne*n*(n+1))/2;
        
        return sum;
    }
}
