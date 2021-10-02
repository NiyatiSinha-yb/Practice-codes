//Time Complexity:O(log n)
//Space Complexity: O(1)
//https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low, mid ,high;
        low=0;
        high=nums.length-1;
        mid=(low+high)/2;
        
        while(low<=high)
        {
            mid=(low+high)/2;
            if(target<nums[mid])
            {
                high=mid-1;
            }
            else if(target>nums[mid])
            {
                low=mid+1;
            }
            else if(target==nums[mid])
                return mid;
        }
        if(target<nums[mid])
            return mid;
            
        else
            return mid+1;
    }
}
