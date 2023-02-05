// 1480. RunningSumof1dArray
// https://leetcode.com/problems/running-sum-of-1d-array/description/?envType=study-plan&id=level-1
//Time Complexity: O(n)
//Spcae Complexity: O(n)

class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum[]= new int[nums.length];
        runningSum[0]=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            runningSum[i]=runningSum[i-1]+nums[i];
        }
        return runningSum;
    }
}
