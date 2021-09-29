//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
//Time Complexity: O(n)
//Space Complexty: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int pointerToIndexOfVal=0;
        
        for(int i=1; i<nums.length; i++)
        {
           if(nums[i]!=nums[pointerToIndexOfVal])
           {
               pointerToIndexOfVal++;
               nums[pointerToIndexOfVal]=nums[i];
           }
        }
        return pointerToIndexOfVal+1;
    }
}
