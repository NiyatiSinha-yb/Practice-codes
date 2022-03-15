//1790. Check if One String Swap Can Make Strings Equal
//https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
//Time complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        int count=0;
        char a=' ';
        char b=' ';
        for(int i=0; i<s1.length(); i++)
        {
            
            if(s1.charAt(i)!=s2.charAt(i))
            {
                count++;
                if(count==1){
                    a=s1.charAt(i);
                    b=s2.charAt(i);
                }
                else{
                    if(a!=s2.charAt(i))
                        return false;
                    if(b!=s1.charAt(i))
                        return false;
                    
                }
                
            }
        }
        if(count<=2 && count!=1)
            return true;
        return false;
    }
}
