//https://leetcode.com/explore/featured/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int removeElement(int[] nums, int val) {
        
        int indexPtr=0; 
        for(int i=0 ;i< nums.length; i++)
        {
           if(nums[i]!=val)
           {
               //System.out.println("Before edit"+Arrays.toString(nums));
               nums[indexPtr]=nums[i];
               indexPtr++;
               //System.out.println("After edit"+Arrays.toString(nums));
           }
        }
        //System.out.println("Final"+Arrays.toString(nums)+ " with no of non val elements="+indexPtr);
        return indexPtr;
    }
}
