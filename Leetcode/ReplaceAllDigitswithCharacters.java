//https://leetcode.com/problems/replace-all-digits-with-characters/submissions/
//1844. Replace All Digits with Characters
//Time complexity: O(n/2)
//Space Complexity: O(n)

class Solution {
    public String replaceDigits(String s) {
        String res="";
        int len=s.length();
        if(s.length()%2==1)
        {
            len--;
        }
        for(int i=0; i<len; i=i+2)
        {
            res+=s.charAt(i)+""+(char)(s.charAt(i)+Character.valueOf(s.charAt(i+1))-48);
        }
        if(s.length()%2==1)
        {
            res+=s.charAt(len);
        }
        return res;
    }
}
