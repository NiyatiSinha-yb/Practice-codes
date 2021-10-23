//1313. Decompress Run-Length Encoded List
//Time Complexity : O(n)
//Space Complexity : O(n)
//https://leetcode.com/problems/decompress-run-length-encoded-list/


class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i=i+2)
        {
            sum+=nums[i];
        }
        int res[]=new int[sum];
        
        int index=0;
        for(int i=0; i<nums.length-1; i=i+2)
        {
            for(int j=0; j<nums[i]; j++)
            {
                res[index++]=nums[i+1];
            }
        }
        return res;
    }
}
