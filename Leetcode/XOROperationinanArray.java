//Time Complexity: O(n)
//Space Complexity: O(1)
//1486. XOR Operation in an Array
//https://leetcode.com/problems/xor-operation-in-an-array/submissions/

class Solution {
    public int xorOperation(int n, int start) {
        int xor=0,val=0;
        for(int i=0; i<n; i++)
        {
            val=start+i*2;
            xor=xor^val;
        }
        return xor;
    }
}
