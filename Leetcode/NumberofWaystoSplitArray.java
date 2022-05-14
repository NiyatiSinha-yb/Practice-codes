//6067. Number of Ways to Split Array
//https://leetcode.com/contest/biweekly-contest-78/problems/number-of-ways-to-split-array/
//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public int waysToSplitArray(int[] nums) {
        double sum=0;
        int res=0;
        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
        }
        
        double lastSum=0;
        double firstSum=0;
        
        for(int i=0; i<nums.length-1; i++)
        {
            firstSum+=nums[i];
            lastSum=sum-firstSum;
            if(firstSum>=lastSum)
                res++;
        }
        return res;
    }
}
