//5227. Maximize the Topmost Element After K Moves
//https://leetcode.com/contest/weekly-contest-284/problems/maximize-the-topmost-element-after-k-moves/

class Solution {
    
    public int findMaxInRange(int[] nums, int k)
    {
            int max=Integer.MIN_VALUE;
            for(int i=0; i< k; i++)
            {
                if(max<nums[i])
                {
                    max=nums[i];
                }
            }
            return max;
    }
    public int maximumTop(int[] nums, int k) {
        if(k%2==1 && nums.length==1)
            return -1;
        
        else if(k>nums.length)
        {
            return findMaxInRange(nums,nums.length);
        }
        else if(k==0)
            return nums[0];
        else
        {
            //System.out.println((k)<nums.length?nums[k]:-1);
            return Math.max(findMaxInRange(nums,k-1),(k)<nums.length?nums[k]:-1);
        }
    }
}
