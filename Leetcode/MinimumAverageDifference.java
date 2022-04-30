//6052. Minimum Average Difference
//https://leetcode.com/contest/biweekly-contest-77/problems/minimum-average-difference/
//Time Complexity: O(n)
//Space complexity: O(1)

class Solution {
    public int minimumAverageDifference(int[] nums) {
        long firstSum=0;
        long lastSum=0;
        long minRes=Long.MAX_VALUE;
        int minIndex=0;
        long totalSum=0;
        for( int i=0; i<nums.length; i++)
        {
            totalSum+=nums[i];
        }
        
        
        for( int i=0; i<nums.length; i++)
        {
            
            
            firstSum+=nums[i];
            lastSum=(totalSum-firstSum);
            int length=i+1;
            long diff=0;
            int lastLength=nums.length-i-1;
            if(i==nums.length-1)
            {
                diff= Math.abs((firstSum/length));
                
                System.out.println(i+", "+diff+" i.e : | "+ firstSum+ "/"+length+" - "+ "0 |");
                System.out.println(i+", "+diff+" i.e : | "+ diff +" - "+ "0 |");
                System.out.println();
            }
            else
            {
                long first=(firstSum/length);
                long second=(lastSum/(lastLength));
                diff= Math.abs((int)(firstSum/length) - (int)(lastSum/(lastLength)));
                //System.out.println(i+", "+diff);
                if(i==29403||i==49988)
                {
                    System.out.println(i+", "+diff+" i.e : | "+ firstSum+ "/" +length+ " - " + lastSum+  "/" +lastLength+ " |");
                    System.out.println(i+", "+diff+" i.e : | "+ first+" - "+ second+" |");
                    System.out.println("minRes = "+minRes+" , diff = "+diff);       
                    System.out.println();
                }
            }
            if(minRes>diff)
            {
                minRes=diff;
                minIndex=i;
            }
            
        }
                 
        System.out.println("FINAL RESULT = "+minIndex);
        return minIndex;
        
        
    }
}
