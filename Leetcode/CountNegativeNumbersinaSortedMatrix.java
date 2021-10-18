//1351. Count Negative Numbers in a Sorted Matrix
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
//Time Complexity: O(n*m)
//Space Complexity: O(1)

class Solution {
    public int countNegatives(int[][] grid) {
        int negCount=0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0;j<grid[i].length; j++)
            {
                if(grid[i][j]<0)
                {
                    negCount+=grid[i].length-j;
                    break;
                }
            }
        }
        return negCount;
    }
}
