//6017. Append K Integers With Minimal Sum
//https://leetcode.com/contest/weekly-contest-283/problems/append-k-integers-with-minimal-sum/
//Time Complexity:O(n)
//Space Complexity: O(1)
class Solution {
    
    public boolean contains(int[] nums, int val)
    {
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>val)
                return false;
            if(nums[i]==val)
                return true;
        }
        return false;
    }
    public long minimalKSum(int[] nums, int k) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=1,j=1; j<=k; i++)
        {
            if(contains(nums,i)==false)
            {
                sum+=i;
                j++;
            }
                   
               
        }
        return sum;
    }
}
