//Time Complexity: O(log n)
//Space Complexity: O(1)
//https://leetcode.com/problems/binary-search/submissions/

class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        int flag=-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(target<nums[mid])
                high=mid-1;
            else if(target>nums[mid])
                low=mid+1;
            else if(target==nums[mid])
            {
                flag=mid;
                return flag;
            }
        }
        return flag;
    }
}
