//Time Complexity: O(1)
//Space Complexity:O(1)
//326. Power of Two
//https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
         int maxPowerOfTwo=(int)Math.pow(2,30); // in int range signed integer has 1 bit for sign thus 1 bit is decreased
        //System.out.println(maxPowerOfTwo);
        return (n>0 && maxPowerOfTwo%n==0);
    }
}
