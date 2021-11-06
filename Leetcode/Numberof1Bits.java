//Time Complexity: O(numbwer of bits of binary number)
//Space Complexity: O(1)
//https://leetcode.com/problems/number-of-1-bits/submissions/
//191. Number of 1 Bits

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //System.out.println(n);
        int count=0;
        while(n!=0) //till n has all bits zero and if n has all bits zero then its value is zero
        {
            count+=n&1; // binary number & 1 = (binary number of m digits & (m-1 times 0)1)
            n=n>>>1; //unsigned shift
        }
        return count;
    }
}
