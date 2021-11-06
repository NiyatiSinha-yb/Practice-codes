//Time Complexity: O(number of bits)
//Space Complexity:O(1)
//231. Power of Two
//https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        int count=0;
        while(n!=0)
        {
            count+=(n&1);
            if(count>1)
                return false;
            n=n>>1;
        }
        return true;
    }
}
