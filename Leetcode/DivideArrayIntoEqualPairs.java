//6020. Divide Array Into Equal Pairs

class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2==1)
            return false;
        HashMap <Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
                map.put(nums[i],1);
        }
        for (Integer value : map.values()) {
            if(value%2==1)
                return false;
        }
            //System.out.println("Value = " + value);
        return true;
        
    }
}
