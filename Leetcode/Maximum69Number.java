//https://leetcode.com/problems/maximum-69-number/submissions/
//1323. Maximum 69 Number
//Time Complexitty: O(n)
//Space Complexity: O(n)

class Solution {
    public int maximum69Number (int num) {
        String str=""+num;
        String a="";
        int flag=0;
        while(str.length()>=1 && str!="")
        {
            if(flag==0 && str.charAt(0)!='9')
            {
                a=a+"9";
                flag=1;
            }
            else
                a=a+str.charAt(0);
            //System.out.println(a);
            if(str.length()!=1)
                str=str.substring(1);
            else
                str="";
        }
        
       return Integer.parseInt(a);
    }
}
