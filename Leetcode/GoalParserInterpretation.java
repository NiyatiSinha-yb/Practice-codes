//https://leetcode.com/problems/goal-parser-interpretation/
//1678. Goal Parser Interpretation
//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public String interpret(String command) {
        String res="";
        int i=0;
        while(i<command.length())
        {
            if(command.charAt(i)=='(')
            {
                i++;
                if(command.charAt(i)==')')
                {
                    res+="o";
                }
                else
                {
                    i=i+2;
                    res+="al";
                }
            }
            else
                res+="G";
            i++;
        }
        return res;
    }
}
