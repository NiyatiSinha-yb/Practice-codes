//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
//Time Complexity: O(n)
//Space Complexty: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int next=0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]!=nums[next])
            {
                next++;
                nums[next]=nums[i];
            }
            
         }
        return next+1;
    }
}
