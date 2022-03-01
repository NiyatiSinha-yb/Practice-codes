//Time Complexity: O(n log n)
//Space Complexity: O(1) -> not considering the res array
//338. Counting Bits
//https://leetcode.com/problems/counting-bits/
class Solution {
    public int[] countBits(int n) {
        
        int res[]=new int[n+1];
        
        for(int i=0; i<n+1; i++)
        {
            res[i]=decimalToBinaryOneFrequency(i);
        }
        
        return res;
    }
    
     public int decimalToBinaryOneFrequency(int num)
    {
        int remainder = 0;
        int freq=0;
  
        // Number should be positive
        while (num > 0) {
            remainder = num % 2;
            if(remainder==1)
                freq++;
            num = num / 2;
        }
         
         return freq;
 
    }
}
