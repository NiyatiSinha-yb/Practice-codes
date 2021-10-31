//Time Complexity: O(n)
//Space Complexity: O(n)
//229. Majority Element II
//https://leetcode.com/problems/majority-element-ii/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int limit=(int)Math.floor(nums.length/3);
        HashMap <Integer, Integer> frq= new HashMap<Integer, Integer>();
        List <Integer> res= new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++)
        {
            if(frq.containsKey(nums[i]))
                frq.put(nums[i],(int)frq.get(nums[i])+1);
            else
                frq.put(nums[i],1);
        }
        for(Map.Entry<Integer, Integer> entry: frq.entrySet())
        {
           // System.out.println(entry.getKey()+"; "+ entry.getValue());
            if(entry.getValue()>limit)
            {
                res.add(entry.getKey());
            }
        }
        return res;
        
    }
}
