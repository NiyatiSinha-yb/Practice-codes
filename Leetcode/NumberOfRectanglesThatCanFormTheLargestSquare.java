//time Complexity: O(n)
//Space Complexity: O(1)
//https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/submissions/
//1725. Number Of Rectangles That Can Form The Largest Square

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int count=0, max=Integer.MIN_VALUE, val;
        for(int i=0; i<rectangles.length; i++)
        {
            val=(int)Math.min(rectangles[i][0], rectangles[i][1]);
            if(max<val)
            {
                max=val;
                count=1;
            }
            else if(max==val)
            {
                count++;
            }
        }
        return count;
        
    }
}
