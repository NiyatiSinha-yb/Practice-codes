//Red OR Green
//https://www.geeksforgeeks.org/problems/red-or-green5711/1?page=2&difficulty=School,Basic&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n)
//Space complexity: O(1)

//{ Driver Code Starts
// initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.RedOrGreen(N, S));
        }
    }
}
// } Driver Code Ends


//User function template for Java

class Solution {
    static int RedOrGreen(int N, String S) {
       //code here
       int c=0;
       for(int i=0; i<N; i++)
       {
           if(S.charAt(i)=='R')
           {
               c++;
           }
       }
       return ((N-c)<c?N-c:c);
    }
}
