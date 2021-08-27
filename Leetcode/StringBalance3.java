//https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int balancedStringSplit(String s) { 
        int r=0,res=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='R')
                r++;
            else if(s.charAt(i)=='L')
                r--;
            if(r==0)
            {
                res++;
            }
        }
        return res;
    }
}
