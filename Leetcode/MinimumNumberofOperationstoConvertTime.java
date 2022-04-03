//https://leetcode.com/contest/weekly-contest-287/problems/minimum-number-of-operations-to-convert-time/
//6055. Minimum Number of Operations to Convert Time

class Solution {
    public int convertTime(String current, String correct) {
        int res=0;
        int val=Integer.parseInt(correct.substring(0,2))-Integer.parseInt(current.substring(0,2));
         System.out.println(val+" for val hours "+res);
        if(val>0){
            res=val;
            System.out.println(val+" for val>0 "+res);
        }
        val=Integer.parseInt(correct.substring(3))-Integer.parseInt(current.substring(3));
        
        if(val<0)
        {
            res=res-1;
            val=val+60;
        }
        System.out.println(val+" for val mins "+res);
        if(val>=15)
        {
            res+=val/15;
            val=val%15;
            System.out.println(val+" for val%15 "+res);
        }
        if(val>=5)
        {
            res+=val/5;
            val=val%5;
            System.out.println(val+" for val%5 "+res);
        }
        if(val>=1)
        {
            res+=val/1;
            val=val%1;
            System.out.println(val+" for val%1 "+res);
        }
        return res;
    }
}
