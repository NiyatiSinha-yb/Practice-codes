//6112. Minimum Amount of Time to Fill Cups
//https://leetcode.com/contest/weekly-contest-301/problems/minimum-amount-of-time-to-fill-cups/
//Space Complexity: O(1)
//Time Complexity: O(n^2 log n)

class Solution {
    int count=0;
    public int fillCups(int[] amount) {
        
        if(amount.length==1)
            return amount[0];
        System.out.println(count);
        return fillSortedCups(amount);
        
    }
    
    public int fillSortedCups(int []amount)
    {
        
        Arrays.sort(amount);
       // System.out.println("** "+ count);
       // for(int i=0; i<amount.length; i++)
           // System.out.println(amount[i]);
        if(amount[amount.length-1]==0)
            return count;
        else if(amount[amount.length-2]==0)
        {
            
            //System.out.println(" amount[amount.length-2]==0 ****"+ count);
            count+=amount[amount.length-1];
            //System.out.println(" amount[amount.length-2]==0 **** "+ count);
           // amount[amount.length-1]=0;
            return count;
        }
        else if(amount[amount.length-1]!=0 && amount[amount.length-2]!=0)
        {
            amount[amount.length-1]--;
            amount[amount.length-2]--;
            count++;
            count=fillSortedCups(amount);
        }
        
        return count;
        
    }
}
