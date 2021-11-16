//Time Complexity: O(s.length()* (s.length()))
//Spcae Complexity: 
//205. Isomorphic Strings
//https://leetcode.com/problems/isomorphic-strings/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap <Character, Character> map= new HashMap<>();
        
        for(int i=0; i<s.length(); i++) //O(n)
        {
            if(map.containsKey(s.charAt(i))) //O(n)
            {
                if(map.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else
            {
                if(map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));    
            }
        }
        
        return true;
    }
}
