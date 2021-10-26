//1137. N-th Tribonacci Number
//https://leetcode.com/problems/n-th-tribonacci-number/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    int nMinus3=0;
    int nMinus2=1;
    int nMinus1=1;
    
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        if(n>=3)
        {
            for(int i=3; i<=n; i++)
            {
                int N=nMinus3+nMinus2+nMinus1;
                nMinus3=nMinus2;
                nMinus2=nMinus1;
                nMinus1=N;
            }
        }
        return nMinus1;
    }
}
