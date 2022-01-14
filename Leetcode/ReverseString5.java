//Time Complexity: O(n/2)-> O(n)
//Space Complexity: O(1) -> inplace
//344. Reverse String
//https://leetcode.com/problems/reverse-string/submissions/

class Solution {
    public void reverseString(char[] s) {
        int len= s.length;
        for(int i=0; i< len/2; i++)
        {
            char temp=s[i]; 
            int replaceWithElementAtIndex=len-i-1;
            s[i] = s[replaceWithElementAtIndex]; 
            s[replaceWithElementAtIndex] = temp;
        }
    }
   
}
