//time Complexity: O(n)
//Space Complexity: O(n)
//https://leetcode.com/problems/two-sum/submissions/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsArray= new HashMap<Integer,Integer>();
        int outputIndexs[]=new int[2];
        int i;
        for(i=0; i<nums.length; i++)
        {
           numsArray.put(nums[i],i);
        }
        //System.out.println(numsArray);
        for(i=0; i<nums.length;i++)
        {
            //System.out.println(numsArray.get(nums[i]));
            if(numsArray.containsKey(target-nums[i])) 
            {
               //System.out.println(numsArray.get(target-nums[i]));
                if(i!=numsArray.get(target-nums[i]))
                {
                    outputIndexs[0]=i;
                    outputIndexs[1]=numsArray.get(target-nums[i]);
                    return outputIndexs;
                }
            }
        }
        return outputIndexs;
    }
}
