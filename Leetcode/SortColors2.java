//75. Sort Colors
//https://leetcode.com/problems/sort-colors/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        int countZero=0;
        int countOne=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                countZero++;
            else if(nums[i]==1)
                countOne++;
        }
        countOne+=countZero;
        for(int i=0; i<nums.length; i++)
        {
            if(i<countZero)
                nums[i]=0;
            else if(i<countOne)
                nums[i]=1;
            else
                nums[i]=2;
        }
    }
}
