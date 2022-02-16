//https://leetcode.com/problems/flipping-an-image/submissions/
//832. Flipping an Image
//Time Complexity: O(n*m)
//Space complexity: O(1)

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++)
        {
            for(int j=0; j<image[0].length; j++)
            {
                if(image[i][j]==0)
                    image[i][j]=1;
                else
                    image[i][j]=0;
            }
        }
        
        for(int i=0; i<image.length; i++)
        {
            for(int j=0; j<image[0].length/2; j++)
            {
                int temp=image[i][j];
                image[i][j]=image[i][image[0].length-j-1];
                image[i][image[0].length-j-1]=temp;
                
            }
        }
        return image;
    }
}
