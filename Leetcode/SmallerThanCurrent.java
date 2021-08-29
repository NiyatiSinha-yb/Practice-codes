//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/

class SmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> numsVsIndex = new TreeMap<Integer,Integer>();
        int result[]=new int[nums.length];
        for(int i=0; i<nums.length;i++)
        {
            if(numsVsIndex.containsKey(nums[i]))
            {
                 numsVsIndex.put(nums[i],numsVsIndex.get(nums[i])+1);
            }
            else
                numsVsIndex.put(nums[i],1);
        }
        //System.out.println(numsVsIndex);
        int numbersSmaller=0,index=0,indexDueToSameValue=0;
        for (Map.Entry<Integer, Integer> entry : numsVsIndex.entrySet()) {
            if(entry.getValue()>1)
            {
                indexDueToSameValue=entry.getValue()-1;
                //System.out.println(indexDueToSameValue+"****");
            }
           numsVsIndex.put(entry.getKey(),index++);
            if(indexDueToSameValue>0)
            {
                index+=indexDueToSameValue;
                indexDueToSameValue=0;
            }
        }
        for(int i=0; i<nums.length;i++)
        {
            result[i]=numsVsIndex.get(nums[i]);
        }
        return result;
    }
}
