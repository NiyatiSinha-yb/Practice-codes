//time complexity; O(n)
//space Complexity: O(n)
//https://leetcode.com/problems/to-lower-case/submissions/
//709. To Lower Case

class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)<='Z' && s.charAt(i)>='A')
            {
                str+=(char)(s.charAt(i)+32);
            }
            else
                str+=s.charAt(i);
        }
        return str;
    }
}
