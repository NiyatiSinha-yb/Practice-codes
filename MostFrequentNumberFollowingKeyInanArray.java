//https://leetcode.com/contest/biweekly-contest-73/problems/most-frequent-number-following-key-in-an-array/
//Time Complexity: O(n) ->HashMap.contains() time complexity is considered as O(1)
//Space Complexity: O(n)
//6024. Most Frequent Number Following Key In an Array

class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap <Integer, Integer> freq = new HashMap<>();
        int max=Integer.MIN_VALUE;
        int ele=key;
        int flag=0;
        
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1]==key)
            {
                if(flag==0)
                {
                    ele=nums[i];
                    flag=1;
                }
                if(!freq.containsKey(nums[i]))
                    freq.put(nums[i],1);
                else
                {
                    int eleFreq=freq.get(nums[i])+1;
                    freq.put(nums[i],eleFreq);
                    if(max<eleFreq)
                    {
                        max=eleFreq;
                        ele=nums[i];
                    }
                }
            }
        }
        return ele;
        
        
        
    }
}
