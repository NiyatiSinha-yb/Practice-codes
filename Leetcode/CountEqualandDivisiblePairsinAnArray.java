//5996. Count Equal and Divisible Pairs in an Array
//

class Solution {
    public int countPairs(int[] nums, int j) {
      
        int res=0;
        
        for(int i=0; i< nums.length; i++)
        {
            for(int k=i+1; k<nums.length; k++)
            {
                
                if(nums[i]==nums[k])
                {
                    if((i*k)%j==0)
                    {
                        res++;
                    }
                }
                
            }
        }
        return res;
    }
}
