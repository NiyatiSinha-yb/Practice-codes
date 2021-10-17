//time Complexity: O()
//Space Complexty: O()
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
//1752. Check if Array Is Sorted and Rotated

class Solution {
    public boolean check(int[] nums) {
        int first=nums[0];
        int count=0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1]<nums[i])
            {
                continue;
            }
            if(nums[i-1]>nums[i])
            {
                count++;
                if(count>1)
                    return false;
                if(first>=nums[nums.length-1])
                {
                    continue;
                }
                else
                    return false;
               
            }
                
        }
        return true;
    }
}
