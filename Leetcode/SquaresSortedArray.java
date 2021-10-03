//https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
//Time Complexity: O(n log n)
//Space Complexity:O(1)

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++)
            nums[i]=nums[i]*nums[i];
        Arrays.sort(nums);
        return nums;
    }
}
