//Time Complexity:O(words.length* MaxLengthOfStringPresentInWords)
//Space Complexity: O(allowed.length())
//https://leetcode.com/problems/count-the-number-of-consistent-strings/submissions/
//1684. Count the Number of Consistent Strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set <Character> ls= new HashSet<>();
        for(int i=0; i<allowed.length(); i++)
        {
            ls.add(allowed.charAt(i));
        }
        //System.out.println(ls);
        int flag=0;
        int count=0;
        for(int i=0; i<words.length; i++)
        {
            flag=0;
            for(int j=0; j<words[i].length(); j++)
            {
                if(!ls.contains(words[i].charAt(j)))
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
