//Check if two given circles touch each other
//https://www.geeksforgeeks.org/problems/checcheck-if-two-given-circles-touch-each-other5038/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int X1 = Integer.parseInt(S[0]);
            int Y1 = Integer.parseInt(S[1]);
            int R1 = Integer.parseInt(S[2]);
            int X2 = Integer.parseInt(S[3]);
            int Y2 = Integer.parseInt(S[4]);
            int R2 = Integer.parseInt(S[5]);
            Solution ob = new Solution();
            System.out.println(ob.circleTouch(X1, Y1, R1, X2, Y2, R2));
        }
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
        //Write your code here
        double dist=(Math.sqrt(Math.pow((X1-X2),2)+Math.pow((Y1-Y2),2)));
        //checks for touch at one point
        // if(dist==R1+R2)
        //     return 1;
        // if(dist==((R1>R2?R1:R2)-(R1<R2?R1:R2)))
        //     return 1;
        // System.out.println(dist);
        // System.out.println(R1+R2);
        
        int bigR=(R1>R2?R1:R2);
        int smallR=(R1<R2?R1:R2);
        if(dist<bigR)
        {
            //The centre of the second circle is within the first circle
            if((dist+smallR)>=bigR)
                return 1;
            
        }
        else{
            //The centre of the second circle is outside the first circle if dist>bigR
            //The centre of the second circle is on the circumference of the first circle if dist=bigR
            if(dist<=(R1+R2))
                return 1;
        }
        
        return 0;
    }
}
