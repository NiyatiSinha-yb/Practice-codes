//6060. Find Closest Number to Zero
//https://leetcode.com/contest/biweekly-contest-76/problems/find-closest-number-to-zero/
//One pass Algo
//Time Complexity: O(n)
//Spcae complexity: O(1)

class Solution {
    public int findClosestNumber(int[] nums) {
        int greatestNumberLessThanZero=Integer.MIN_VALUE;
        int smallestNumberGreaterThanZero=Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>0)
            {
                if(nums[i]<smallestNumberGreaterThanZero)
                    smallestNumberGreaterThanZero=nums[i];
            }
            else
            {
                if(nums[i]>greatestNumberLessThanZero)
                    greatestNumberLessThanZero=nums[i];
            }
        }
        
        System.out.println(greatestNumberLessThanZero+", "+smallestNumberGreaterThanZero);
        
        if(greatestNumberLessThanZero==Integer.MIN_VALUE)
        {
            return smallestNumberGreaterThanZero;
        }
        
        if((int)Math.abs(greatestNumberLessThanZero)>smallestNumberGreaterThanZero){
            System.out.println("->+");
            return smallestNumberGreaterThanZero;
        }
        
        else if((int)Math.abs(greatestNumberLessThanZero)<smallestNumberGreaterThanZero){
            
            System.out.println("-<+");
            return greatestNumberLessThanZero;
        }
        
        else{
            System.out.println("-=+");
            return smallestNumberGreaterThanZero;
        }
        
    }
}
