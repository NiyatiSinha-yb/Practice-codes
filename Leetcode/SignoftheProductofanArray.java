//One Pass Algo
// time Complexity : O(n)
// Space Coomplexity: O(1)
//https://leetcode.com/problems/sign-of-the-product-of-an-array/submissions/
//1822. Sign of the Product of an Array

class Solution {
    public int arraySign(int[] nums) {
        //on multiplying numbers can go out of bound
        
        int negCount=0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                return 0;
            if(nums[i]<0)
                negCount++;
        }
        
        if(negCount%2==0)//pos
            return 1;
        return -1;
    }
}
