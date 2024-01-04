//Delete alternate characters
//https://www.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(S.length())
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

            System.out.println(ob.delAlternate(S));
        }
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        String res="";
        for(int i=0; i<S.length(); i=i+2)
        {
            res+=S.charAt(i);
        }
        return res;
    }
}
