//Time Complexity: O(log n base 3)
//Spcae Complexity:O(1)
//https://leetcode.com/problems/power-of-three/submissions/
//326. Power of Three

class Solution {
    public boolean isPowerOfThree(int n) {
         long i=1;
        if(n<=0)
            return false;
        if(n%3==0 || n==1)
        {
            while(n>i)
            {
                i=i*3;
            }
        }
        if(n==i)
            return true;
        return false;
    }
}
