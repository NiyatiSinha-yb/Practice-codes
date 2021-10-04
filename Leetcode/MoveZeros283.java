//https://leetcode.com/problems/move-zeroes/
//TimeComplexity: O(n)
//Space Complexity:O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int i;
        for(i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                count++;
        }
        int start=0;
        for(i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
                nums[start++]=nums[i];
        }
        for(i=nums.length-count; i<nums.length; i++)
        {
            nums[start++]=0;
        }
        
    }
}
