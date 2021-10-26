//Time Complexity: O(n+1)
//Space Complexity: O(n+1)
//338. Counting Bits
//https://leetcode.com/problems/counting-bits/

class Solution {
    public int[] countBits(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=0; i<n+1; i++)
        {
            dp[i]=dp[i/2]+i%2;
        }
        return dp;
        
    }
}
