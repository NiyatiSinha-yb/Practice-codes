//6051. Count Prefixes of a Given String
//https://leetcode.com/contest/biweekly-contest-77/problems/count-prefixes-of-a-given-string/
//time Complexity: O(n)
//space complexity: O(1)
class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(int i=0; i<words.length; i++)
        {
            if(s.indexOf(words[i])==0)
                count++;
        }
        return count;
    }
}
