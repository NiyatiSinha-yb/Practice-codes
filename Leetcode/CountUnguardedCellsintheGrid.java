//https://leetcode.com/contest/biweekly-contest-77/problems/count-unguarded-cells-in-the-grid/
//6053. Count Unguarded Cells in the Grid
//Time Complexity: O(n*m)
//Spcae complexity:O(n*m)

class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int arr[][]= new int[m][n];
        
       // System.out.println(m+" , "+n);
        
        // for(int i=0; i<m; i++)
        // {
        //     for(int j=0; j<n; j++)
        //     {
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        
        for(int i=0; i<guards.length; i++)
        {
            
            //System.out.println(guards[i][0]+ " "+ guards[i][1]);
            arr[guards[i][0]][guards[i][1]]=1;//guards
            
            //System.out.println();
        }
        
        for(int i=0; i<walls.length; i++)
        {
            
            //System.out.println(walls[i][0]+ " "+ walls[i][1]);
            arr[walls[i][0]][walls[i][1]]=2;//walls
                
            //System.out.println();
        }
        
        // for(int i=0; i<m; i++)
        // {
        //     for(int j=0; j<n; j++)
        //     {
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        
        System.out.println();
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                int copy =i;
                if(arr[i][j]==1)
                {
                    while(j<n && arr[i][j]!=2 )
                    {
                        //System.out.println(arr[i][j]+ ", "+i+" ,"+j);
                        if(arr[i][j]!=1)
                           
                            arr[i][j]=3;//guarded
                        j++;
                    }
                    
                    
                    //System.out.println();
                    // for(int x=0; x<m; x++)
                    // {
                    //     for(int y=0; y<n; y++)
                    //     {
                    //         System.out.print(arr[x][y]+ " ");
                    //     }
                    //     System.out.println();
                    // }
                    
                }
                
            }
            //System.out.println();
        }
        
        for(int i=0; i<m; i++)
        {
            for(int j=n-1; j>=0; j--)
            {
                int copy =i;
                if(arr[i][j]==1)
                {
                    while(j>=0 && arr[i][j]!=2 )
                    {
                        //System.out.println(arr[i][j]+ ", "+i+" ,"+j);
                        if(arr[i][j]!=1)
                            arr[i][j]=3;//guarded
                        j--;
                    }
                    
                    
                    //System.out.println();
                    // for(int x=0; x<m; x++)
                    // {
                    //     for(int y=0; y<n; y++)
                    //     {
                    //         System.out.print(arr[x][y]+ " ");
                    //     }
                    //     System.out.println();
                    // }
                    
                }
                
            }
            //System.out.println();
        }
        
    for(int j=0; j<n; j++)
        {
        for(int i=0; i<m; i++)
        {
           
                int copy =i;
                if(arr[i][j]==1)
                {
                    while(i<m && arr[i][j]!=2 )
                    {
                        //System.out.println(arr[i][j]+ ", "+i+" ,"+j);
                        if(arr[i][j]!=1)
                            arr[i][j]=3;//guarded
                        i++;
                    }
                    
                    
                    //System.out.println();
                    // for(int x=0; x<m; x++)
                    // {
                    //     for(int y=0; y<n; y++)
                    //     {
                    //         System.out.print(arr[x][y]+ " ");
                    //     }
                    //     System.out.println();
                    // }
                    
                }
                
            }
            //System.out.println();
        }
        
        for(int j=0; j<n; j++)
        {
        for(int i=m-1; i>=0; i--)
        {
           
                //int copy =i;
                if(arr[i][j]==1)
                {
                    while(i>=0 && arr[i][j]!=2 )
                    {
                        //System.out.println(arr[i][j]+ ", "+i+" ,"+j);
                        if(arr[i][j]!=1)
                            arr[i][j]=3;//guarded
                        i--;
                    }
                    
                    
                    //System.out.println();
                    // for(int x=0; x<m; x++)
                    // {
                    //     for(int y=0; y<n; y++)
                    //     {
                    //         System.out.print(arr[x][y]+ " ");
                    //     }
                    //     System.out.println();
                    // }
                    
                }
                
            }
            //System.out.println();
        }
        
        
        
        int count=0;
         for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
               // System.out.print(arr[i][j]+ " ");
                if(arr[i][j]==0)
                    count++;
            }
            //System.out.println();
        }
        
        return count;
        
    }
}
