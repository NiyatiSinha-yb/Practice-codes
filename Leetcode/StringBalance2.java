//https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
//Time Complexity: O(n)
//Space Complexity: O(1)

class StringBalance2 {
    public int balancedStringSplit(String s) { 
        int r=0, l=0,res=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='R')
                r++;
            else if(s.charAt(i)=='L')
                l++;
            if(r==l)
            {
                res++;
                r=0;
                l=0;
            }
        }
        return res;
    }
}
