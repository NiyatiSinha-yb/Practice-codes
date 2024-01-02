//Convert String to LowerCase
//https://www.geeksforgeeks.org/problems/java-convert-string-to-lowercase2313/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy

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
            String S = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.toLower(S));
        }
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
    static String toLower(String S) {
        // code here
        return S.toLowerCase();
    }
}
