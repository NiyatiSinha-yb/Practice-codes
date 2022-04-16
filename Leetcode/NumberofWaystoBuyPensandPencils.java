//https://leetcode.com/problems/number-of-ways-to-buy-pens-and-pencils/submissions/
//2240. Number of Ways to Buy Pens and Pencils
//Time Complexity: O(total/cost1)
//Space Complexity: O(1)

import java.math.BigInteger;

class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int maxPen=total/cost1;
        int maxPencil=total/cost2;
        
        
        int pencil=0;
        int pen=0;
        
        if(maxPen==0 && maxPencil==0)
            return 1;
        
        long count=0;
        
        for(int i=0;i<=maxPen;i++)
        {
            pencil=(total-(cost1*i))/cost2;
            
            count+=pencil+1;
        }
        return count;
       
    }
}
