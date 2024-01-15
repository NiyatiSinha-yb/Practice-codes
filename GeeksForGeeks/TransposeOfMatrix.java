//Transpose of Matrix
//https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1?page=1&difficulty=School,Basic,Easy&status=unsolved,attempted&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions
//Time Complexity: O(n*n)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine().trim());
        while(t-->0)
        {
            int n=Integer.parseInt(in.readLine().trim());
            int a[][]=new int[n][n];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                for(int j=0;j<n;j++){
                    a[i][j]=Integer.parseInt(s[j]);
                }
            }
            Solution ob=new Solution();
            ob.transpose(n,a);
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    out.print(a[i][j]+" ");
                }out.println();
            }
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public void transpose(int n,int arr[][])
    {
        int temp=0;
        int z=0;
        for(int i=z; i<n; i++)
        {
            for(int j=z; j<n; j++)
            {
                //System.out.println(arr[i][j]+ ", "+arr[j][i]);
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                //System.out.println(arr[i][j]+ ", "+arr[j][i]);
            }
            z++;
        }
    }
}
