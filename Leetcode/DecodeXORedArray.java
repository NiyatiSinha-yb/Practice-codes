//Time Complexity: O(n-1)
//Space Complexity: O(n)
//1720. Decode XORed Array
//https://leetcode.com/problems/decode-xored-array/

class Solution {
    public int[] decode(int[] encoded, int first) {
        int res[]= new int[encoded.length+1];
        res[0]=first;
        for(int i=1; i<res.length; i++)
        {
            res[i]=res[i-1]^encoded[i-1];
        }
        return res;
    }
}
