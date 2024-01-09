//Sum of diagonals
//https://www.geeksforgeeks.org/problems/sum-of-diagonals-1587115621/1?page=2&difficulty=School,Basic&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			int [][] M = new int[N][N];
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					M[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.sumDiagonal(N, M));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int sumDiagonal(int N, int [][] M) {
		//Write your code here
		int sum=0;
		for(int i=0; i<N; i++)
		{
		    sum+=M[i][i];
		}
		return sum;
	}
}
