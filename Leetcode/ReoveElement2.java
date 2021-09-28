//Time Complexity: O(n)
//Space Complexity: O(1)
//https://leetcode.com/explore/featured/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
class Solution {
    public int removeElement(int[] nums, int val) {
        int nonVal=nums.length;
        for(int i=0; i<nonVal; i++)
        {
            if(nums[i]==val)
            {
                nonVal--;
                //System.out.println("Before Swap"+Arrays.toString(nums));
                //System.out.println("Elements to swap "+nums[i]+" , "+nums[nonVal]);
                int temp=nums[i];
                nums[i]=nums[nonVal];
                nums[nonVal]=temp;
                i--;
               // System.out.println("After swap"+ Arrays.toString(nums));
            }
            //System.out.println();
        } 
        return nonVal;
    }
}
