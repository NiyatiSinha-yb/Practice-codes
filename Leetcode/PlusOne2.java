//https://leetcode.com/problems/plus-one/
//66. Plus One
//best solution
//time Complexity: O(n)
//Spcae Complexity : O(n+1)
class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = ++digits[digits.length-1]/10;
        if(carry==0)
        {
            //System.out.println("**");
            return digits;
        }
        
        digits[digits.length-1]= digits[digits.length-1]%10;
        for(int i=digits.length-2; i>=0; i--)
        {
            digits[i]+=carry;
            carry=0;
            if(digits[i]/10==0)
                break;
            else
            {
                digits[i]=digits[i]%10;
                carry=1;
            }
        }
        if(carry==1)
        {
            int res[]=new int[digits.length+1];
            //System.out.println(carry);
            //res[res.length-1]=res[res.length-2];
            
            
            /*
            for(int i=res.length-1;i>0; i--)
            {
                res[i]=digits[i-1];
            }
            */
            //if the carry has caused to change length of the no. then it is understood that all preceding digits are now 0
            
            //as we have added 1 is units digits and if that addition is causing change in the most dominant digit then all preceding 9+1 made it 10 making the carry as 1
            
            res[0]=carry;
            return res;
        }
        return digits;
    }
}
