//Time Complexity: O(n^2)
//Space Complexity: O(n)
//https://leetcode.com/problems/two-sum/submissions/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                //System.out.println(i+" "+j);
                if(nums[i]+nums[j]==target)
                {
                    int arr[]=new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return nums;
    }
}
