//Time Complexity:O(words.length* MaxLengthOfStringPresentInWords)
//Space Complexity: O(1)
//https://leetcode.com/problems/count-the-number-of-consistent-strings/submissions/
//1684. Count the Number of Consistent Strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0; i<words.length; i++)
        {
            int flag=0;
            for(int j=0; j<words[i].length(); j++)
            {
                if(allowed.indexOf(words[i].charAt(j))==-1)
                {
                    flag=-1;
                    break;
                }
            }
            if(flag==0)
                count++;
        }
        
        return count;
    }
}
