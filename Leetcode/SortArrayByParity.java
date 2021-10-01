//Time Complexity: O(n)
//Space Complexity: (1)
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int putOddAtIndex=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]%2==0)
            {
                int temp=nums[i];
                nums[i]=nums[putOddAtIndex];
                nums[putOddAtIndex++]=temp;
            }
        }
        return nums;
    }
}
