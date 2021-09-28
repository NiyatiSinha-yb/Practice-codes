//Time Complexity: O(n)
//Memory Complexity: O(1)
//https://leetcode.com/explore/featured/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
class Solution {
    public int removeElement(int[] nums, int val) {
        int nonVal=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==val)
            {
                nonVal=i;
                break;
            }
        }
        int i=nums.length-1;
        int temp;
        while(nonVal<=i)
        {
            if(nums[i]!=val)
            {
                temp=nums[i];
                nums[i]=nums[nonVal];
                nums[nonVal++]=temp;
            }
            else
                i--;
        }
        
        return nonVal;
    }
}
