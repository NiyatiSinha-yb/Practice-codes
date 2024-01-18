//Number of Diagonals
//https://www.geeksforgeeks.org/problems/number-of-diagonals1020/1?page=1&status=unsolved,attempted&sortBy=difficulty
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.diagonals(N));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long diagonals(int n) 
    { 
       //code here.
       long i=1;
       return (i*(n-3)*n)/2;
    } 
}
