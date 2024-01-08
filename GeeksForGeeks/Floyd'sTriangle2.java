//Floyd's triangle
//https://www.geeksforgeeks.org/problems/floyds-triangle1222/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy

//Time Complexity: O(n^2)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            Solution ob = new Solution();
            ob.printFloydTriangle(N);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void printFloydTriangle(int N){
        // code here
        int k=1;
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
