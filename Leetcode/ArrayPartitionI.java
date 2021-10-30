//time Complexity:O(n log n)
//Space Complexity : O(1)
//https://leetcode.com/problems/array-partition-i/submissions/
//561. Array Partition I

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int sum=0;
        for(int i=0; i<nums.length-1; i=i+2)
        {
            sum+=Math.min(nums[i], nums[i+1]);
        }
        return sum;
    }
}
