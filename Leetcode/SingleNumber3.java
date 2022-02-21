//Time Complexity:O(n)
//Space Complexity: O(1)
//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/
//https://leetcode.com/problems/single-number/
//136. Single Number

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++)
        {
            ans^=nums[i];
        }
        
        return ans;
    }
}
