//https://leetcode.com/problems/sort-colors/
//75. Sort Colors
//Space Complexity ; O (1)
//Time Complexity: O(n)


class Solution {
    public void sortColors(int[] nums) {
        int ptr=0;
        int zeroIn=0;
        int twoIn=nums.length;
        
        while(ptr<twoIn)
        {
            if(nums[ptr]==0)
            {
                if(ptr==zeroIn)
                {
                    ptr++;
                    zeroIn++;
                }
                else
                {
                    nums[ptr]=nums[zeroIn];
                    nums[zeroIn++]=0;
                }
            }
            else if(nums[ptr]==2)
            {
                nums[ptr]=nums[--twoIn];
                nums[twoIn]=2;
            }
            else if(nums[ptr]==1)
                ptr++;
        }
        
    }
}
