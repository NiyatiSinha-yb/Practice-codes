//time Complexity: O(n+m)
//space complexity: O(n)
//https://leetcode.com/problems/number-of-good-pairs/submissions/


class Solution {
   
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> hashNums= new HashMap<Integer, Integer>();
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(hashNums.containsKey(nums[i]))
                hashNums.put(nums[i],hashNums.get(nums[i])+1);
            else
                hashNums.put(nums[i],1);
        }
        //System.out.println(hashNums);
        int value=0;
        for(Map.Entry start : hashNums.entrySet())
        {
            //System.out.println(factorial(Integer.valueOf((int)start.getValue())));
            value=Integer.valueOf((int)start.getValue());
            if(value>=2) 
               count+=(value*(value-1))/2;
             //count+=factorial(Integer.valueOf((int)start.getValue()))/(factorial(Integer.valueOf((int)start.getValue())-2)*factorial(2));
               //count+=(factorial(Integer.valueOf((int)start.getValue())-2,Integer.valueOf((int)start.getValue())))/2;
               
        }
        return count;
    }
}
