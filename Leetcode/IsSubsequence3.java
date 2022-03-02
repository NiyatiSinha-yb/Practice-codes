//time Complexity: O(length of t)
//Space Complexity: O(1)
//https://leetcode.com/problems/is-subsequence/
//392. Is Subsequence
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, j=0;
        for(i=0, j=0; i<s.length() && j<t.length(); )
        {
            //System.out.println("Compare "+s.charAt(i)+" with "+t.charAt(j));
            if(s.charAt(i)==t.charAt(j))
            {
                j++;
                i++;
            }
            else
            {
                j++;
            }
        }
        //System.out.println(i+","+j);
        if(i==s.length())
            return true;
        return false;
        
    }
}
