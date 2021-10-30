//time Complexity; O(n)
//Spcae Complexity: O(n)
//922. Sort Array By Parity II
//https://leetcode.com/problems/sort-array-by-parity-ii/

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int res[]=new int[nums.length];
        int odd=1;
        int even=0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]%2==1){
                res[odd]=nums[i];
                odd=odd+2;
            }
            else{
                res[even]=nums[i];
                even=even+2;
            }
        }
        return res;
    }
}
