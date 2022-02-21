//Time Complexity:O(n)
//Space Complexity: O(n)
//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/
//https://leetcode.com/problems/single-number/
//136. Single Number

class Solution {
    public int singleNumber(int[] nums) {
        ArrayList <Integer> arr = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++)
        {
            if(!arr.contains(nums[i]))
            {
                arr.add(nums[i]);
            }
            else
            {
               arr.remove(new Integer(nums[i]));
            }
            
        }
        System.out.println(arr);
        return arr.get(0);
    }
}
