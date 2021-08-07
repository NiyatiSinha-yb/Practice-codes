class Solution {
    public int findNumbers(int[] nums) {
        int evenFreq=0;
        for(int i=0; i<nums.length;i++)
        {
            String ele=Integer.toString(nums[i]);
            if(ele.length()%2==0)
            {
                evenFreq++;
            }
            
        }
        return evenFreq;
    }
}
