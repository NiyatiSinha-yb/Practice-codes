//time Complexity: O(1)
//Space Complexity: O(1)
//29. Divide Two Integers
//https://leetcode.com/problems/divide-two-integers/submissions/


class Solution {
    public int divide(int dividend, int divisor) {
        //range of integer is -214 748 3648 to 214 748 3647
        //Thus -214 748 3648/-1 needs to be handelled
        if(dividend==Integer.MIN_VALUE && divisor==-1)
            return dividend/divisor-1;
        return dividend/divisor;
    }
}
