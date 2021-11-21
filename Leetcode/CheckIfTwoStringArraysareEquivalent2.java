/Time Complexity: O(max(word1.length,word2.length))
//Spcae complexity; O(max(word1.length,word2.length))
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/
//1662. Check If Two String Arrays are Equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1="";
        String w2="";
        for(int i=0; i<word1.length; i++)
        {
            w1+=word1[i];
        }
        
        for(int i=0; i<word2.length; i++)
        {
            w2+=word2[i];
        }
         if(w1.equals(w2))
              return true;
        return false;
    }
}
