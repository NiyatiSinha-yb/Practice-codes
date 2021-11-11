//Time Complexity: O(n)
//Space Complexity: O(n)
//387. First Unique Character in a String
//https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character, Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1); //frequency of each character
        }
        
        for(int i=0; i<s.length(); i++)
        {
            if(map.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        //no character is unique
        return -1;
        
    }
}
