//https://leetcode.com/explore/featured/card/recursion-i/250/principle-of-recursion/1440/
//Time Complexity: O(n/2)
//Space Complexity : O(1)

class Solution {
   /* public String reverse (String str)
    {
        if(str.length()==0)
            return "";
        else
            return reverse(str.substring(1,str.length()))+str.charAt(0);
    }*/
    public void reverseString(char[] s) {
        //System.out.println(reverse(Arrays.toString(s)));
        char temp;
        for(int i=0; i< s.length/2; i++)
        {
            temp=s[i];
            s[i]=s[(s.length-1)-i];
            s[(s.length-1)-i]=temp;
        }
    }
}
