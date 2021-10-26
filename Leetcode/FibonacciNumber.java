//Time Complexity: O(n)
//Space Complexity: O(1)
//509. Fibonacci Number
//https://leetcode.com/problems/fibonacci-number/

class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
            
        int resIMinusOne=1; // F(1)
        int resIMinusTwo=0; // F(0)
        
        for(int i=2; i<=n; i++)
        {
            int temp=resIMinusOne+resIMinusTwo;
            resIMinusTwo=resIMinusOne;
            resIMinusOne=temp;
        }
        return resIMinusOne;
        
    }
}
