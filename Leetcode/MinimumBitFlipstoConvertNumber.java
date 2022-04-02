//6033. Minimum Bit Flips to Convert Number
//https://leetcode.com/contest/biweekly-contest-75/problems/minimum-bit-flips-to-convert-number/
//Space Complexity: O(1)
//Time Complexity: O(no of binary bits) i.e O(ln 2)

class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        System.out.println(xor);
        int noOfBitsToFlip=0;
        while(xor!=0)
        {
            if((xor&1)==1)
                noOfBitsToFlip++;
            xor=xor>>1;
        }
        
        return noOfBitsToFlip;
    }
}
