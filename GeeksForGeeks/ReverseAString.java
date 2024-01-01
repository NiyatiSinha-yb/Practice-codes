//https://www.geeksforgeeks.org/problems/java-reverse-a-string0416/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Reverse a String
//Time Complexity: O(length of String)
//Space Complexity: O(1)

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

            System.out.println(ob.revStr(S));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String revStr(String S) {
        // code here
        String str="";
        for(int i=S.length()-1; i>=0; i--)
        {
            str+=S.charAt(i);
        }
        return str;
    }
}
