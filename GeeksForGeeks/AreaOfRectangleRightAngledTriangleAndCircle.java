//Area of Rectangle, Right Angled Triangle and Circle
//https://www.geeksforgeeks.org/problems/area-of-rectange-right-angled-triangle-and-circle2600/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int W = Integer.parseInt(S[1]);
            int B = Integer.parseInt(S[2]);
            int H = Integer.parseInt(S[3]);
            int R = Integer.parseInt(S[4]);

            Solution ob = new Solution();
            int[] ptr = ob.getAreas(L,W,B,H,R);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.print(ptr[1]);
            System.out.print(" ");
            System.out.println(ptr[2]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] getAreas(int L , int W , int B , int H , int R) {
        // code here
        int rectArea=L*W;
        int triArea=(B*H)/2;
        int cirArea=(int)(3.14*R*R);
        
        int area[]=new int[3];
        area[0]=rectArea;
        area[1]=triArea;
        area[2]=cirArea;
        
        return area;
    }
};
