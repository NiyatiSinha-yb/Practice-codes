//time Complexity: O(n+m)
//space complexity: O(n)
//https://leetcode.com/problems/number-of-good-pairs/submissions/

class GoodPair2 {
    public int factorial(int valueDeno, int valueNum)
    {
        int fact=1;
        for(int i=valueDeno+1; i<=valueNum; i++)
        {
            fact*=i;
        }
        return fact;
    }
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
        System.out.println(hashNums);
        for(Map.Entry start : hashNums.entrySet())
        {
            //System.out.println(factorial(Integer.valueOf((int)start.getValue())));
           if(Integer.valueOf((int)start.getValue())>=2) 
               //count+=factorial(Integer.valueOf((int)start.getValue()))/(factorial(Integer.valueOf((int)start.getValue())-2)*factorial(2));
               count+=(factorial(Integer.valueOf((int)start.getValue())-2,Integer.valueOf((int)start.getValue())))/2;
        }
        return count;
    }
}
