//136. Single Number
//https://leetcode.com/problems/single-number/
//time Complexity: O(n)
//space Complexity: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0; i<nums.length; i++)
        {
            res^=nums[i];
        }
        return res;
    }
}

//Binary val ^ itself gives 0
//as even no. of 1's XOR give 0

//And binary no. ^ 0 = that binary number
//as odd no. of 1's XOR gives 1
