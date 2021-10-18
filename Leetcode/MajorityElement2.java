//https://leetcode.com/problems/majority-element/
//169. Majority Element
//time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int majorityElement(int[] nums) {
        int majority=0;
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(i==0)
                majority= nums[i];
            if(nums[i]==majority)
                count++;
            else 
                count--;
            if(count<0){
                count=0;
                majority=nums[i];
            }
        }
        return majority;
    }
}
