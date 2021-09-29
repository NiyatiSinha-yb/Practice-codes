//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero=-1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                nums[++nonZero]=nums[i];
            }
        }
        for(int i=nonZero+1; i<nums.length; i++)
        {
            nums[i]=0;
        }
    }
}
