//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
//961. N-Repeated Element in Size 2N Array
//Time Complexity: O(n)
//Space complexity: O(n)

class Solution {
    public int repeatedNTimes(int[] nums) {
        
        //n+1 unique elements
        //thus any element that has frequency >1 is the one that will be repeated for n times.
        HashSet <Integer> elements = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++)
        {
            if(elements.contains(nums[i]))
            {
                return nums[i];
            }  
            elements.add(nums[i]);
        }
        return 0;
        
    }
}
