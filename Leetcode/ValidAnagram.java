//https://leetcode.com/problems/valid-anagram/submissions/
//242. Valid Anagram
//Time Complexity: O(n)
//Space complexity: O(n)

class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList <Character> lettersInWord_s= new ArrayList <>();
        if(s.length() != t.length())
            return false;
        for(int i=0; i<s.length(); i++)
        {
            lettersInWord_s.add(s.charAt(i));
        }
        for(int i=0; i<s.length(); i++)
        {
            if(lettersInWord_s.contains(t.charAt(i)))
            {
                lettersInWord_s.remove(new Character(t.charAt(i)));
            }
            else
                return false;
        }
        return true;
        //if(letterInWord_s.length)
    }
}
