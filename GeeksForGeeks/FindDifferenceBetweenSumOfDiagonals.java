//Find difference between sum of diagonals
//https://www.geeksforgeeks.org/problems/find-difference-between-sum-of-diagonals1554/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(n)
//Space complexity: O(1)

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int Grid[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] s = read.readLine().split(" ");
                for (int j = 0; j < N; j++) Grid[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.diagonalSumDifference(N, Grid));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        // code here
        int sum=0;
        int len=Grid.length;
        for(int i=0; i<len; i++)
        {
            sum+=Grid[i][i];
            sum-=Grid[i][len-i-1];
        }
        if(sum<0)
        {
            return -1*sum;
        }
         return sum;
    }
}
