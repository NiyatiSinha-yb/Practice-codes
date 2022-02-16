//https://leetcode.com/problems/smallest-index-with-equal-value/submissions/
//2057. Smallest Index With Equal Value
//Time Complexity : O(n)
//Space Complexity: O(1)

class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0; i<nums.length; i++)
        {
            if(i%10==nums[i])
                return i;
        }
        return -1;
    }
}
