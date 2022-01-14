//Time Complexity: O(log n)
//Space Complexity: O(log n) -> stack space for recursive calls
//231. Power of Two
//https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        if(n<1 || n%2==1)
            return false;
        return power(2,n);
    }
    boolean power(int i, int n)
    {
        if(i==n)
            return true;
        if(i>n)
            return false;
        if(i<=Integer.MAX_VALUE/2)
            return power(i*2,n);
        else
            return false;
    }
}
