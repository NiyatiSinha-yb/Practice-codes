//One Pass Algorithm
//Time Complexity : O(n)
//Space complexity: O(1)
//268. Missing Number
//https://leetcode.com/problems/missing-number/


class Solution {
    public int missingNumber(int[] nums) {
        //Given Numbers Range from 0 to nums.length both inclusive
        //sum of first N natural Numbers= n(n+1)/2
        //sum of first N natural numbers- missing natural number= sum of given array that as one element missing
        
        int sum= nums.length*(nums.length+1)/2; // will always result to integer as two consecutive numbers will have definately one even number
        
        for(int i=0; i< nums.length; i++)
        {
            sum-=nums[i];
        }
        return sum;
    }
}
