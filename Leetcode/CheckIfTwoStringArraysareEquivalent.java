//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/
//1662. Check If Two String Arrays are Equivalent
//time Complexity: O(max(word1.length,word2.length))
//Space Complexity: O(max(word1.length,word2.length))


class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        return(String.join("", word1).equals(String.join("", word2)));
    }
}
