//Time Complexity:O(n)
//Space Complexity: O(n)
//1021. Remove Outermost Parentheses
//https://leetcode.com/problems/remove-outermost-parentheses/submissions/

class Solution {
    public String removeOuterParentheses(String s) {
        int open=0;
        String res="";
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push('(');
                if(open!=0)
                {
                    res+=s.charAt(i);
                }
                open++;
                
            }
            else if(s.charAt(i)==')')
            {
                if(open!=1)
                {
                    res+=s.charAt(i);
                }
                open--;
                stack.pop();
                
            }
            // if(open==0)
            // {
            //     if(i<s.length()-1)
            //         return "";
            //     else 
            //         return s.substring(1,s.length()-1);
            // }
        }
        return res;
        
    }
}
