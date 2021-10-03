//https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
//Time Complexity: O(n)
//Space Complexity:O(n)

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int smallestNegativeNum=0;
        for(int i=0; i<nums.length; i++)
            if(nums[i]<0)
                smallestNegativeNum=i;
        int in=0;
        int sorted[]=new int[nums.length];
        int i,j;
        for(i=smallestNegativeNum+1,j=smallestNegativeNum;i<nums.length && j>=0; )
        {
            if(nums[i]*nums[i]<nums[j]*nums[j])
            {
                sorted[in++]=nums[i]*nums[i];
                i++;
            }
            else
                sorted[in++]=nums[j]*nums[j--];
        }
        if(i<nums.length)
        {
            for(int l=i; l<nums.length; l++)
                sorted[in++]=nums[l]*nums[l];
        }
          
        else if(j>=0)
        {
            for(int l=j; l>=0; l--)
                sorted[in++]=nums[l]*nums[l];
        }
        return sorted;
    }
}
