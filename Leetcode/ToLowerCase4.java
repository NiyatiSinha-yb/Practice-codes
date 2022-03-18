//709. To Lower Case
//https://leetcode.com/problems/to-lower-case/
//Time Complexity: O(s.length())
//space Complexity; O(1)

class Solution {
    public String toLowerCase(String s) {
        String res="";
       for(int i=0; i<s.length(); i++)
       {
           char temp=s.charAt(i);
           if(temp>=65 && temp<=90)
           {
               res+=(char)(s.charAt(i)+32);
           }
           else
               res+=s.charAt(i);
       }
        return res;
    }
}
