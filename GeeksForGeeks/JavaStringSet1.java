//Java Strings | Set 1
//https://www.geeksforgeeks.org/problems/java-strings-set-15112/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Time Complexity: O(n)
//Space Complexity: O(1)

//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.conRevstr(S1, S2));
        }
    }
}

// } Driver Code Ends


// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String s=S1+S2;
        String res="";
        for(int i=s.length()-1; i>=0; i--)
        {
            res+=s.charAt(i);
        }
        return res;
    }
}
