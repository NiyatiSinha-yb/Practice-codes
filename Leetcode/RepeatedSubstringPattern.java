//Time Complexity: O(n)
//Space Complexity: O(1)
//https://leetcode.com/problems/repeated-substring-pattern/submissions/
//459. Repeated Substring Pattern

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String subString="";
        String check="";
        int f=s.length();
        for(int i=1; i<f; i++)
        {
            subString+=s.charAt(i-1);
            
            if(f%i==0)
            {
                check="";
                for(int j=0; j<f/i; j++)
                {
                    check+=subString;
                }
                //System.out.println(i+": "+check+" =="+ s);
                if(check.equals(s))
                    return true;
            }
        }
        return false;
    }
}
