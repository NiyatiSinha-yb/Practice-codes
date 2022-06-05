//https://leetcode.com/contest/weekly-contest-296/problems/partition-array-such-that-maximum-difference-is-k/
//Time Complexity: O(n^2)
//6091. Partition Array Such That Maximum Difference Is K
//Space Complexity: O(1)
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int partition=0;
        
        if(k==0)
        {
            partition=1;
            int prev=nums[0];
            for(int i=1; i< nums.length; i++)
            {
                if(nums[i]!=prev)
                {
                    partition++;
                    prev=nums[i];
                }
            }
        }
        
        else{
          for(int i=0; i< nums.length; )
          {
              for(int j=nums.length-1; j>=i; j--)
              {
                  diff=nums[j]-nums[i];
                  if(diff<=k)
                  {
                      i=j+1;
                      partition++;
                  }
              }
          }
        }
        return partition;
    }
}
