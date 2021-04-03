class Solution {
    public int longestValidParentheses(String s) {
        ArrayList<Character> a = new ArrayList<Character>();
        int valid=0,max=0,flag=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
                a.add('(');
            
            if(s.charAt(i)==')')
            {
                if(a.size()!=0){
                    
                    a.remove(a.size()-1);
                    // removing lastadded element of ArrayList
                    
                     valid+=2;
                    System.out.println(valid);
                }
                else
                {
                    if(max<valid)
                        max=valid;
                    valid=0;
                    
                }
                
                if(max<valid)
                    max=valid;
                
            }
        }
        return max;
    }
}
