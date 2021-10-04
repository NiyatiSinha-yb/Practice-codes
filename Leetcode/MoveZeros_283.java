//https://leetcode.com/problems/move-zeroes/
//TimeComplexity: O(n)
//Space Complexity:O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero=0;
        int i;
        for(i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
                nums[nonZero++]=nums[i];        
        }
        for(i=nonZero; i<nums.length; i++)
            nums[i]=0;
    }
}
