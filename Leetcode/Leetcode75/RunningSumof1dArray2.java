// 1480. RunningSumof1dArray
// https://leetcode.com/problems/running-sum-of-1d-array/description/?envType=study-plan&id=level-1
//Time Complexity: O(n)
//Spcae Complexity: O(n)

class Solution {
    public int[] runningSum(int[] nums) {
        //Using input array
        for(int i=1; i<nums.length; i++)
        {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
