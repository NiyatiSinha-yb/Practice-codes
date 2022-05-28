//time Complexity: O(n)
//SpaceComplexity: O(9) -> O(1)
//https://leetcode.com/contest/biweekly-contest-79/problems/check-if-number-has-equal-digit-count-and-digit-value/
//6083. Check if Number Has Equal Digit Count and Digit Value


class Solution {
    public boolean digitCount(String num) {
        int arr[]=new int[10];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=0;
        }
        
        for(int i=0; i<num.length(); i++)
        {
            int val=num.charAt(i)-48;
            arr[val]++;
        }
        
        for(int i=0; i<num.length(); i++)
        {
            int val=num.charAt(i)-48;
            //int numOfI=(num.charAt(val)-48);
            if(val!=arr[i])
                return false;
        }
        
        
        return true;
    }
}
