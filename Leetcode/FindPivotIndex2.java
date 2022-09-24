//https://leetcode.com/problems/find-pivot-index/submissions/
//724. Find Pivot Index
//Time complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftsum=0;
        int sum=0;
        
        for(int p=0; p<nums.length; p++)
            {
               sum+=nums[p]; 
            }
        
        for(int i=0; i<nums.length; i++)
        {
            if(leftsum==sum-leftsum-nums[i])
                return i;
            leftsum+=nums[i];
        }
        return -1;
        
    }
}
