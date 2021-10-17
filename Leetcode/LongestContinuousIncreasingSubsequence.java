//https://leetcode.com/problems/longest-continuous-increasing-subsequence/
//674. Longest Continuous Increasing Subsequence
//Time Complexity: O(n^2)
//Spcae Complexity: O(1)


class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
       for(int i=0; i<nums.length-1; i++)
       {
           int localIncreasing=0;
           int prev=nums[i];
           int j=i+1;
           while(j<nums.length)
           {
               if(prev<nums[j])
               {
                   //System.out.println(prev+" , "+nums[j]);
                   localIncreasing++;
                   prev=nums[j++];
               }
               else 
                   break;
           }
           // System.out.println();
           if(localIncreasing>max)
               max=localIncreasing;
       }
        return max+1;
    }
}
