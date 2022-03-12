//Space Complexity : O(1)
//Time Complexity; O(n log n) -> sorting
//976. Largest Perimeter Triangle
//https://leetcode.com/problems/largest-perimeter-triangle/

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        //int sumOfOtherTwoSides=0;
        for(int j=nums.length-1; j>=2; j--)
        {
           if(nums[j]<(nums[j-1]+nums[j-2]))
           {
               return nums[j]+nums[j-1]+nums[j-2];
           }
        }
        return 0;
    }
}
