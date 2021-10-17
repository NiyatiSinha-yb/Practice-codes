//66. Plus One
//https://leetcode.com/problems/plus-one/
//Time complexity: O(n)
//space Complexity: O(n)


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
            for(int i=res.length-1;i>0; i--)
            {
                res[i]=digits[i-1];
            }
            res[0]=carry;
            return res;
        }
        return digits;
    }
}
