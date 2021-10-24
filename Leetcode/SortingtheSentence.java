//1859. Sorting the Sentence
//https://leetcode.com/problems/sorting-the-sentence/
//Time Complexity: O(n)
//Space Complexity: O(9)

class Solution {
    public String sortSentence(String s) {
        String arr[]=new String[9];
        int index=0;
        String res="";
        for(int i=0; i<s.length(); i++)
        {
            
            if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)
            {
                if(s.charAt(i)-48-1>index)
                    index=s.charAt(i)-48-1;
                res+=" ";
                arr[s.charAt(i)-48-1]=res;
                res="";
            }
            else if(s.charAt(i)!=' ')
            {
                res+=s.charAt(i);
            }
        }
        for(int i=0; i<=index; i++)
        {
            res+=arr[i];
        }
        return res.trim(); // remove the ending whiteSpace
        
    }
}
