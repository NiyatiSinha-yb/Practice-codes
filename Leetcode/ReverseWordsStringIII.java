//557. Reverse Words in a String III

//Space Complexity: O(n)
//Time Complexity: O(n)
//where n is length of string s
class Solution {
    public String reverseWords(String s) {
        String res="";
        String word="";
        for(int i=0;i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                res+=word+" ";
                word="";
            }
            else
            {
                word=s.charAt(i)+word;
            }
        }
        if(word!="")
            res+=word;
        return res;
    }
}
