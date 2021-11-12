//https://leetcode.com/problems/find-the-duplicate-number/submissions/
//287. Find the Duplicate Number
//Time Complexity: O(nums.length * log (nums.length))
//Space Complexity: O(nums.length-1)  -> as for sure One element is duplicate


class Solution {
    public int findDuplicate(int[] nums) {
        Set <Integer> unq= new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(unq.contains(nums[i]))
                return nums[i];
            else
                unq.add(nums[i]);
        }
        return 0; //never possible as there is atleast ne duplicate element
    }
}
