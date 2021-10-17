//58. Length of Last Word
//https://leetcode.com/problems/length-of-last-word/
//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public int lengthOfLastWord(String s) {
        //System.out.println(s.lastIndexOf(' '));
        String word="";
        int i;
        int flag=-1;
        if(s.lastIndexOf(' ')==-1)
            return s.length();
        for(i=s.length()-1; i>0; i--)
        {
            if(s.charAt(i)!=' ' && s.charAt(i-1)==' ')
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            for(;i<s.length(); i++)
            {
                if(s.charAt(i)==' ')
                    break;
                word+=s.charAt(i);
            }
        }
        else
        {
            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(j)==' ')
                    break;
                word+=s.charAt(j);
            }
        }
        return word.length();
    }
}
