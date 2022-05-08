//https://leetcode.com/contest/weekly-contest-292/problems/largest-3-same-digit-number-in-string/
//6056. Largest 3-Same-Digit Number in String
//Time Complexity: O(n)
//Space Complexity: O(1)


class Solution {
    public String largestGoodInteger(String num) {
        long max=-1;
        String res="";
        for(int i=0; i<num.length()-2; i++)
        {
            if(Integer.parseInt(num.substring(i,i+3))>max)
            {
                if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2))
                {
                    max=Integer.parseInt(num.substring(i,i+3));
                    res=num.substring(i,i+3);
                }
            }
        }
        return res;
    }
}
