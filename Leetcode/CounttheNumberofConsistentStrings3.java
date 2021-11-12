//Time Complexity: O(words.length) //doubt: only if matches() function has Time Complexity O(1)
//Spcae Complexity: O(1)
//1684. Count the Number of Consistent Strings
//https://leetcode.com/problems/count-the-number-of-consistent-strings/submissions/

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0; i<words.length; i++)
        {
            if(words[i].matches("["+allowed+"]*"))
                count++;
        }
        
        return count;
    }
}
