//1614. Maximum Nesting Depth of the Parentheses
//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/submissions/
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            if(max<count)
                max=count;
            if(s.charAt(i)==')')
            {
                count--;
            }
            
        }
        return max;
    }
}
