//Time Complexity : O(log n)
//Space complexity : O(1)
//744. Find Smallest Letter Greater Than Target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length;
        int mid;
        while(low<high)
        {
            mid=low+(high-low)/2;
           
            if(letters[mid]<=target)
            {
                low=mid+1;
            }
            else
                high=mid;
           
        }
        
        return letters[low % letters.length];
        
    }
}
