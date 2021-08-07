class Solution {
    public int[] sortedSquares(int[] nums) {
        int numSq[]=new int[nums.length];
        int posIndexStart=-1;
        int k=nums.length-1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>=0)
            {
                posIndexStart=i;
                break;
            }
        }
        //System.out.println(posIndexStart);
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=nums[i]*nums[i];
            //System.out.println(nums[i]);
        }
        if(posIndexStart==0)
        {
            return nums;
        }
        else if(posIndexStart==-1)
        {
            for(int i=0; i<nums.length; i++){
                numSq[k--]=nums[i];
                
            }
            return numSq;
        }
        else
        {
            k=nums.length-1;
            for(int i=0, j= nums.length-1; i<=(posIndexStart-1) || j>=posIndexStart; )
            {
               // System.out.println("i="+i+", j="+j);
               // System.out.println("nums[i]="+nums[i]+", nums[j]="+nums[j]);
                if(nums[i]>nums[j])
                {
                    //System.out.println(nums[i]+"-->--"+nums[j]);
                    numSq[k--]=nums[i++];
                }
                else if(nums[i]<nums[j])
                {
                   // System.out.println(nums[i]+"--else--"+nums[j]);
                    numSq[k--]=nums[j--];
                }
                else{
                    if(i<=(posIndexStart-1))
                    {
                        numSq[k--]=nums[i++];
                    }
                    else
                    {
                         numSq[k--]=nums[j--];
                    }
                }
            }
        }
        return numSq;
    }
}
