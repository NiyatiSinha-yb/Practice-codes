//Diagonal sum
//https://www.geeksforgeeks.org/problems/diagonal-sum0158/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts


//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.DiagonalSum(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




class Solution
{
    public int DiagonalSum(int[][] matrix)
    {
        // code here
        int sum=0;
        int len=matrix.length;
        for(int i=0; i<len; i++)
        {
            sum+=matrix[i][i];
            sum+=matrix[i][len-i-1];
        }
        return sum;
    }
}
