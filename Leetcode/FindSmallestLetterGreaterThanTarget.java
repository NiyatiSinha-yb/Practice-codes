
//744. Find Smallest Letter Greater Than Target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//Time Complexity : O(n)
//Space Complexity : O(1)

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0; i<letters.length; i++)
        {
            if(letters[i]>target)
                return letters[i];
                
        }
        return letters[0];
    }
}
