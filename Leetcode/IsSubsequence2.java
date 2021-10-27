//392. Is Subsequence
//https://leetcode.com/problems/is-subsequence/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s=="")
            return true;
        else if(t=="")
            return false;
        int i=0,j;
        for(i=0, j=0; i<s.length() && j<t.length();)
        {
            if(s.charAt(i)==t.charAt(j))
            {   
                //System.out.println(i+"=="+j);
                i++;
                j++;
            }
            else
                j++;
            //System.out.println(i+"; "+j);
        }
        //aSystem.out.println(i);
        if(i<s.length())
            return false;
        return true;
            
    }
    
}
