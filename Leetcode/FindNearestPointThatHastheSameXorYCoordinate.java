//Time complexity: O(n)
//Space complexity: O(1)
//https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
//1779. Find Nearest Point That Has the Same X or Y Coordinate

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int shortestDistance=Integer.MAX_VALUE;
        int smallestIndex=Integer.MAX_VALUE;
        int validPointFound=0;
        
        for(int i=0; i<points.length; i++)
        {
            if( x==points[i][0] || y==points[i][1] )
            {
                validPointFound=1;
                //System.out.println(points[i][0]+","+points[i][1]);
                
                int manhattanDistance=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
               // System.out.println(points[i][0]+","+points[i][1]+","+manhattanDistance);
                if(shortestDistance>manhattanDistance)
                {
                    if(smallestIndex>i && shortestDistance==manhattanDistance)
                        smallestIndex=i;
                    else
                        smallestIndex=i;
                    shortestDistance=manhattanDistance;
                    
                }
                
                


            }
        }
        if(validPointFound==1)
        {
            return smallestIndex;
        }
        return -1;
    }
}
