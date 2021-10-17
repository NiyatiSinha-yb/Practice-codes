//https://leetcode.com/problems/longest-continuous-increasing-subsequence/
//674. Longest Continuous Increasing Subsequence
//time complexity: O(n)
//Spcae Compelexity : O(1)

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        int localIncreasing=0;
        int prev=nums[0];
        for(int i=1; i<nums.length; i++)
       {
            //System.out.println(prev);
           if(prev<nums[i])
           {
               localIncreasing++;
               //System.out.println(localIncreasing+", "+", prev= "+prev+", nums[i] = "+nums[i]);
               prev=nums[i];
           }
           else{
              // System.out.println("**");
               prev=nums[i];
               localIncreasing=0;
           }
          
           if(localIncreasing>max)
               max=localIncreasing;
       }
        return max+1;
    }
}
