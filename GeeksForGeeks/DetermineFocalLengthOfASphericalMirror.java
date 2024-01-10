//Determine focal length of a spherical mirror
//https://www.geeksforgeeks.org/problems/determine-focal-length-of-a-spherical-mirror5415/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String type = br.readLine().trim();
            float R = Float.parseFloat(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.findFocalLength(R, type);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int findFocalLength(float R, String type)
    {
        // code here
        switch(type){
            case "concave": return (int)Math.floor(R/2);
            case "convex": return (int)Math.floor(-1*R/2);
        }
        return -999;
    }
}
