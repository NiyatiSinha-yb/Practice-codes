//20. Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/submissions/
//Time Complexity: O(n)
//Space complexity : O(n)

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1= new Stack<Character>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack1.push(s.charAt(i));
            else{
                if(stack1.size()==0)
                    return false;
                char popped=stack1.pop();
                if(s.charAt(i)==')' && popped!='(')
                    return false;
                else if(s.charAt(i)=='}' && popped!='{')
                    return false;
                else if(s.charAt(i)==']' && popped!='[')
                    return false;
            }
                    
        }
        if(stack1.size()==0)
            return true;
        return false;
    }
}
