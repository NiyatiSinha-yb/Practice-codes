//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
//1502. Can Make Arithmetic Progression From Sequence
//Time complexity: O(n)
//Space coplexity: O(1)
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        for(int i=2; i<arr.length; i++)
        {
            if(diff!=arr[i]-arr[i-1])
                return false;
            
        }
        return true;
    }
}
