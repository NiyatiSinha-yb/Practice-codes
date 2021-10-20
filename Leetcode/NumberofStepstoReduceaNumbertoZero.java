//1342. Number of Steps to Reduce a Number to Zero
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//Time Complexity: O(n) --> n is number of digits in num
//Space complexity: O(1)
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        
        while(num!=0)
        {
            if(num==1){
                count++;
                break;
            }
            if(num%2==1)
               count++;
            num=num/2;
            count++;
        }      
        return count;
        
    }
}
