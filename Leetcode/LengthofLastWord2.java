//time Complexitry: O(n)
//Space Complexity: O(1)
//58. Length of Last Word
//https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        if(s.lastIndexOf(' ')==-1)
            return s.length();
        s=s.trim(); //String after removeing the initial and ending spaces
        s=s.substring(s.lastIndexOf(' ')+1);
        return s.length();
    }
}
