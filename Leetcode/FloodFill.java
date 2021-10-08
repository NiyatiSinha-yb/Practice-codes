//https://leetcode.com/problems/flood-fill/
//Flood Fill

class Solution {
    int primaryColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
       // System.out.println(image.length+" "+image[0].length);
       primaryColor=image[sr][sc];
        image[sr][sc]=newColor;
       checkNeighbours(image, sr, sc, newColor);
       return image;
        
    }
    public void checkNeighbours(int[][] image, int sr, int sc, int newColor)
    {
        try{
        if(sr-1>=0 && sr-1<image.length)
        {
            if(image[sr-1][sc]==primaryColor )
            {
                image[sr-1][sc]=newColor;
                checkNeighbours(image,sr-1,sc,newColor);
            }
            else 
                System.out.println("false");
          
        }
        
        if(sr+1>=0 && sr+1<image.length)
        {
            if(image[sr+1][sc]==primaryColor)
            {
                 image[sr+1][sc]=newColor;
                checkNeighbours(image,sr+1,sc,newColor);
                 
                
            }
            
                
        }
     
        if(sc-1>=0 && sc-1<image[0].length)
        {
            if(image[sr][sc-1]==primaryColor)
            {
                image[sr][sc-1]=newColor;
                checkNeighbours(image,sr,sc-1,newColor);
                
                
            }
        }
        
       
        if(sc+1>=0 && sc+1<image[0].length)
        {
            if(image[sr][sc+1]==primaryColor )
            {
                image[sr][sc+1]=newColor;
                checkNeighbours(image,sr,sc+1,newColor);
                
            }
        }
        
        }
        catch(Exception e)
        {
            System.out.println("hi");
        }
        
    }
}
