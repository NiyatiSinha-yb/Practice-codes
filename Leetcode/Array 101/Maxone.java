class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, count=0;
        for(int i=0; i<nums.length; i++)
        {
            //System.out.println("element at index["+i+"] = "+nums[i]);
            if(nums[i]==0){
                if(max<count)
                {
                    
                    max=count;
                    //System.out.println("Enter if: max="+max);
                }
                count=0;
            }
            else{
                  
                    count++;
                // System.out.println("Enter else: count->"+count);
            }
        }
        if(max<count)
            max=count;
        
        
        return max;
    }
}
