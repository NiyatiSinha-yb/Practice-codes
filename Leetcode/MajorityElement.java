//https://leetcode.com/problems/majority-element/
//169. Majority Element
//Time Complexity: O(n log n)
//Space Complexity: O(1)


class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
