class Solution {
    //6031. Find All K-Distant Indices in an Array
    //https://leetcode.com/contest/weekly-contest-284/problems/find-all-k-distant-indices-in-an-array/
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        //ArrayList <Integer> KeyValueFound =new ArrayList <>();
        ArrayList <Integer> res =new ArrayList <>();
        //int flag=0;
        int lastAdded=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==key)
            {
                int start=i-k-1;
                int end =i+k+1;
                
                if(start<0)
                    start=lastAdded;
                if(end>nums.length)
                    end=nums.length;
                
                for(int z=start; z<end; z++)
                {
                        if(Math.abs(z-i)<=k)
                        {  
                            if(!res.contains(z))
                            //{
                                res.add(z);
                                lastAdded=z;
                            //}
                        }
                }
                
            }
            
        }
        return res;
    }
}
