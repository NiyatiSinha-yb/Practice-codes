//2160. Minimum Sum of Four Digit Number After Splitting Digits
//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
//Time Complexity: O(num.length)
//Space Complexity: O(num.length)
class Solution {
    public int minimumSum(int num) {
        //Extract each digit
        int copy = num;
        int digits[]= new int[4];
        int i = 0;
        while(copy!=0)
        {
            digits[i++] = copy%10;
            copy/=10;
        }
        Arrays.sort(digits);
        
        //digits[0]->smallest
        //digits[1]->3rd largest
        //digits[2]->4th largest
        //digits[3]->largest
        
        int sum = (digits[0]*10+digits[3])+(digits[1]*10+digits[2]);
        return sum;
        
    }
}
