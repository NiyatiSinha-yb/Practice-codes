//time Complexity: O(n^2)
//Space Complexity: O(1)
//392. Is Subsequence
//https://leetcode.com/problems/is-subsequence/submissions/


class Solution {
    public boolean isSubsequence(String s, String t) {
        try{
            if(s=="")
                return true;
            int i = t.indexOf(s.charAt(0));
            //System.out.println(i+ " , "+ s+" , "+t);

            if(i<0)
                return false;
            else if(s.length()==1)
                return true;
            return isSubsequence(s.substring(1),t.substring(i+1));
        }
        catch(Exception e)
        {
            System.out.println("Exception");
            return true;
        }
            
    }
    
}
