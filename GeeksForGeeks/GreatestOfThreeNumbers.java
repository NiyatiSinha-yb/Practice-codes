//GreatestOfThreeNumbers.java
//https://www.geeksforgeeks.org/problems/greatest-of-three-numbers2520/1?page=2&difficulty=School&status=unsolved&sortBy=accuracy

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
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int C = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.greatestOfThree(A, B, C));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int greatestOfThree(int A, int B, int C) {
        // code here
        int greater= A>B?A:B;
        greater=greater>C?greater:C;
        return greater;
    }
}
