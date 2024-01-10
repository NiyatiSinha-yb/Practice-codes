//Parallel or Perpendicular?
//https://www.geeksforgeeks.org/problems/parallel-or-perpendicular4257/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
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
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] A = new int[3];
            int[] B = new int[3];
            for(int i = 0; i < 3; i++)A[i] = Integer.parseInt(S1[i]);
            for(int i = 0; i < 3; i++)B[i] = Integer.parseInt(S2[i]);
            Solution ob = new Solution();
            int ans = ob.find(A, B);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int dotProduct(int[] A, int[] B)
    {
        return A[0]*B[0]+A[1]*B[1]+A[2]*B[2];
    }
    public int[] crossProduct(int[] A, int[] B)
    {
        int crossProductVector[]= new int[3];
        crossProductVector[0]=A[1]*B[2]-A[2]*B[1];
        crossProductVector[1]=A[0]*B[2]-A[2]*B[0];
        crossProductVector[2]=A[0]*B[1]-A[1]*B[0];
        return crossProductVector;
        
    }
    public int magnitude(int A[])
    {
        return A[0]*A[0]+A[1]*A[1]+A[2]*A[2];
    }
    public int find(int[] A, int[] B)
    {
        // code here
        int crossProductVector[]= new int[3];
        crossProductVector=crossProduct(A,B);
        if(magnitude(crossProductVector)==0)
            return 1; //parallel
        //System.out.println(dotProduct(A,B));
        if(dotProduct(A,B)==0)
            return 2; //perpendicular
        return 0;
    }
}
