//190. Reverse Bits
//https://leetcode.com/problems/reverse-bits/
//Time Complexity: O(n)
//Spcae Complexity: O(1)

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;
        for(int i=1; i<=32; i++)
        {
            res=res<<1;
            res=res|n&1;
            
            //System.out.println(Integer.toBinaryString(res));
            n=n>>1;
            //System.out.println(Integer.toBinaryString(n)+"\n");
        }
        
        return res;
    }
}
