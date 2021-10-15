//217. Contains Duplicate
//https://leetcode.com/problems/contains-duplicate/
//time Complexity: O(n log n)
//space Complexity: O(1)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1]==nums[i])
                return true;
        }
        return false;
    }
}
