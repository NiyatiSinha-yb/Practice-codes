//Time complexity: O(n^2)
//Space Complexity: O(1)
//724. Find Pivot Index
//https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftSum=0;
        int rightSum=0;
        for(int i=0; i<nums.length; i++)
        {
            leftSum=0;
            rightSum=0;
            
            for(int p=0; p<i;p++)
            {
               leftSum+=nums[p]; 
            }
            for(int p=i+1; p<nums.length;p++)
            {
               rightSum+=nums[p]; 
            }
            //System.out.println(leftSum+" , "+ rightSum+ "\n\n");
            if(leftSum==rightSum)
                return i;
        }
        return -1;
        
    }
}
