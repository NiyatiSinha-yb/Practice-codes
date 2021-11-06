//Time Complexity: O(1)
//Space Complexity:O(1)
//326. Power of Three
//https://leetcode.com/problems/power-of-three/

class Solution {
    public boolean isPowerOfThree(int n) {
         int maxPowerOfThree=1162261467; // in int range
        return (n>0 && maxPowerOfThree%n==0);
    }
}
