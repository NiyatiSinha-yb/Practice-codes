//Combinational Logic
//https://www.geeksforgeeks.org/problems/combinational-logic1908/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = new String[6];
            S = read.readLine().split(" ");
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int C = Integer.parseInt(S[2]);
            int D = Integer.parseInt(S[3]);
            int E = Integer.parseInt(S[4]);
            int F = Integer.parseInt(S[5]);
            Solution ob = new Solution();

            System.out.println(ob.logicalOperation(A, B, C, D, E, F));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int logicalOperation(int A,int B,int C,int D,int E,int F){
        // code here
        // System.out.println(~A);
        int res= ((~(A))&B)|(C&D)|(E&(~(F)));
        return res;
    }
}
