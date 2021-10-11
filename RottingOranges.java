//994. Rotting Oranges
//https://leetcode.com/problems/rotting-oranges/
//Time Complexity: O(n^2)
//Spcae Complexity: O(2*n)

class Solution {
    int totalCount=0;
    int oneCount=0;
    int flag=0;
    int min=0;
    Queue<int[]> rotten = new LinkedList<>();
    Queue<int[]> q = new LinkedList<>();
    public int orangesRotting(int[][] grid) {
        if(flag==0)
        {
            flag=1;
            for(int i=0; i<grid.length; i++)
            {
                for(int j=0; j<grid[0].length; j++)
                {
                    if(grid[i][j]==2 || grid[i][j]==1)
                        totalCount++;
                    /*if(grid[i][j]==1)
                        totalCount++;*/
                }
            }
        }
        if(totalCount==0)
            return 0;
        
        for(int i=0; i<grid.length; i++)
            {
                for(int j=0; j<grid[0].length; j++)
                {
                    if(grid[i][j]==2 )
                    {
                        
                            rotten.add(new int[]{i,j});
                            q.add(new int[]{i,j});
                            totalCount--;
                        
                    }
                }
            }
        //System.out.println("Queue: " + q.element());
        if(q.isEmpty())
        {
            return -1;
        }
       
       while(!q.isEmpty())
       {
           /*
           System.out.println("Checking");
           for(int i=0; i<grid.length; i++)
           {
               for(int j=0; j<grid[0].length; j++)
               {
                   System.out.print(grid[i][j]+" ** ");
               }
               System.out.println();
               
           }
           System.out.println();
           */
           min++;
           int size=q.size();
           //System.out.println(min+" ," +size);
           
           for(int i=0; i<size; i++)
           {    
           
               int arr[]=q.poll();
               
               //System.out.println(arr[0]+" "+arr[1]);
               
               if(arr[0]-1>=0 && grid[arr[0]-1][arr[1]]==1)
               {
                  // System.out.println("##1");
                   grid[arr[0]-1][arr[1]]=2;
                   q.offer(new int[]{arr[0]-1,arr[1]});
                   totalCount--;
               }
              // System.out.println("Con1: ##");
                //System.out.println(arr[0]+1+" , "+arr.length);
                if(arr[0]+1<grid.length && grid[arr[0]+1][arr[1]]==1)
               {
                    //System.out.println("##2");
                   grid[arr[0]+1][arr[1]]=2;
                    q.offer(new int[]{arr[0]+1,arr[1]});
                    totalCount--;
               }
                //System.out.println("Con2: ##");
                if(arr[1]-1>=0 && grid[arr[0]][arr[1]-1]==1)
               {
                  //  System.out.println("##3");
                   grid[arr[0]][arr[1]-1]=2;
                    q.offer(new int[]{arr[0],arr[1]-1});
                    totalCount--;
               }
               // System.out.println("Con3: ##");
                if(arr[1]+1<grid[0].length && grid[arr[0]][arr[1]+1]==1)
               {
                   // System.out.println("##4");
                   grid[arr[0]][arr[1]+1]=2;
                    q.offer(new int[]{arr[0],arr[1]+1});
                    totalCount--;
               }  
              /// System.out.println("##");
           }
           
       }
        if(totalCount==0)
            return min-1;
        //last set of oranges made rotten are added unnecessarily to queue to we don' count their iteration
        return -1;
    }
}
