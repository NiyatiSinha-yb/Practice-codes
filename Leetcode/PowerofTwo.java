//Time Complexity: O(log n)
//Spcae Complexity:O(1)
//231. Power of Two
//https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        long i=1;
        if(n%2==0 || n==1)
        {
            while(n>i)
            {
                i=i*2;
            }
        }
        if(n==i)
            return true;
        return false;
    }
}
