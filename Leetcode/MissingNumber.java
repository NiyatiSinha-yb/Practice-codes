//https://leetcode.com/problems/missing-number/submissions/
//268. Missing Number
//Time complexity: O(n)
//Space Complexity: O(n)
//Two Pass Algorithm


class Solution {
    public int missingNumber(int[] nums) {
        TreeSet <Integer> sortedArray = new TreeSet<>();
        for(int i=0; i<nums.length; i++)
        {
            sortedArray.add(nums[i]);
        }
        int index=0;
        for(int i:sortedArray)
        {
            if(i!=index)
                return index;
            index++;
        }
        return index;
    }
}
