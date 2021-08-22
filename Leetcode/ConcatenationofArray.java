Time Complexity: O(n)
Space Complexity: O(2*nums.length)
  //https://leetcode.com/problems/concatenation-of-array/submissions/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2*nums.length];
        for(int i=0; i< nums.length; i++)
        {
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
        
    }
}
