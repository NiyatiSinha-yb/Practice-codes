
//Time Complexity: O(32)
//Space Complexity: O(1)
//https://leetcode.com/problems/number-of-1-bits/submissions/
//191. Number of 1 Bits


public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       // System.out.println(n);
        
        int binarybit=0;
        //int count=0;
        
        while(n!=0)
        {
            binarybit+=n&1; //can be added only if the resulting bit of AND operation is 1, thus birarybit iytself behaves as count
           // if(binarybit==1)
           //     count++;
            n=n>>>1;
        }
        return binarybit;
    
    }
}
