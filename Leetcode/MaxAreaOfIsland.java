//https://leetcode.com/problems/max-area-of-island/submissions/
//695. Max Area of Island

//Time Complexity: O(N*N*N)
//Space Complexity: O(N)

class Solution {
    static int currentCount=0;
    public int maxAreaOfIsland(int[][] grid) {
        
        int maxCount=0;
        //int currentCount=0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                currentCount=0;
                if(grid[i][j]==1)
                {
                    count(grid,i,j);
                    if(currentCount>maxCount)
                        maxCount=currentCount;
                }
            }
        }
        return maxCount;
    }
    public void count(int grid[][],int i, int j)
    {
        if(grid[i][j]==1)
        {
            currentCount++;
            grid[i][j]=-1;
            if(i-1>=0)
            {   
                count(grid,i-1,j);
            }
            if(i+1<grid.length)
            {
                count(grid,i+1,j);
            }
            if(j-1>=0)
            {
                count(grid,i,j-1);
            }
            if(j+1<grid[0].length)
            {
                count(grid,i,j+1);
            }
            
        }
    }
}
