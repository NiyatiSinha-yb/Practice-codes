//PatternPrinting.java
//https://www.geeksforgeeks.org/problems/pattern-printing1347/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n)
//Space complexity: O(n)

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
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.printPattern(N);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void printPattern(int N){
        // code here
        String str="*";
        for(int i=0; i<N; i++)
        {
            System.out.print(str+" ");
            str+="*";
        }

    }
}
