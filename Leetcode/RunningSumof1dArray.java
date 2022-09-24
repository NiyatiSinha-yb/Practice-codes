//https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1
//1480. Running Sum of 1d Array
//Time Complexity: O(n)
//Space complexity: O(1)

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++)
        {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
