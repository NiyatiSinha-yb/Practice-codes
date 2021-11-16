//Time Complexity: O(n)
//Space Complexity: O(n+n)=O(n)
//https://leetcode.com/problems/isomorphic-strings/solution/
//205. Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int arrS[]=new int[256];
        int arrT[]=new int[256]; //default value of all 26 indexes is 0
        
        for(int i=0; i<s.length(); i++)
        {
            if(arrS[s.charAt(i)]!=arrT[t.charAt(i)])
                return false;
            arrS[s.charAt(i)]=i+1;
            arrT[t.charAt(i)]=i+1;
        }
        return true;
    }
}
