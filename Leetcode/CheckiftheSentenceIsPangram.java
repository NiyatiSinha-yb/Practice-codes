//time Complexity: O(sentence.length())
//Space cOmplexxity: O(26)
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/
//1832. Check if the Sentence Is Pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence=sentence.toLowerCase();
        int alphabets[]=new int[26];
        for(int i=0; i<sentence.length(); i++)
        {
            if(alphabets[sentence.charAt(i)-97]==0)
                alphabets[sentence.charAt(i)-97]=1;
        }
        for(int i=0; i<26; i++)
            if(alphabets[i]==0)
                return false;
        return true;
        
    }
}
