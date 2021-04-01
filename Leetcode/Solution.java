class Solution {
    public int findDuplicate(int[] nums) {
        
        int slowPointer= nums[0];
        int fastPointer= nums[0];
        
        do{
            slowPointer=nums[slowPointer];
            fastPointer=nums[nums[fastPointer]];
        } while (slowPointer!=fastPointer);
        
        fastPointer=nums[0];
        
        while(slowPointer!=fastPointer)
        {
            slowPointer=nums[slowPointer];
            fastPointer=nums[fastPointer];
        }
        
        return slowPointer;
        
    }
}
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Find the Duplicate Number.
Memory Usage: 38.8 MB, less than 81.80% of Java online submissions for Find the Duplicate Number.s for Find the Duplicate Number.
*/
