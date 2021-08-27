//https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
//Time Complexity: O(n^2)
//Space Complexity: O(n)
class StringBalance {
    public int balancedStringSplit(String s) {
        Stack<Character> stk= new Stack<>(); 
        int r=0, l=0,res=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='R')
                r++;
            else if(s.charAt(i)=='L')
                l++;
            if(r==l)
            {
                res++;
                while(l!=0)
                {
                    stk.pop();
                    l--;
                    r--;
                }
            }
            else
                stk.push(s.charAt(i));
        }
        return res;
    }
}
