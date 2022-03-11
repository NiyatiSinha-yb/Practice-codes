//Time Complexity: O(no of didgits in n)
//space Complexity: O(1)
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/
//1281. Subtract the Product and Sum of Digits of an Integer

class Solution {
    public int subtractProductAndSum(int n) {
        int duplicate=n;
        int sum=0;
        int prod=1;
        int rem;
        
        while(duplicate!=0)
        {
            rem=duplicate%10;
            sum+=rem;
            prod*=rem;
            
            duplicate=duplicate/10;
            
        }
        
        return prod-sum;
    }
}
