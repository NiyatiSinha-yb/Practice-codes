//2006. Count Number of Pairs With Absolute Difference K
//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
//Time complexity: O(n(n+1)/2) = O(n^2)
//space Complexity: O(1)

class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(Math.abs(nums[i]-nums[j])==k)
                {
                    count++;
                }
            }
                
        }
        return count;
    }
}
