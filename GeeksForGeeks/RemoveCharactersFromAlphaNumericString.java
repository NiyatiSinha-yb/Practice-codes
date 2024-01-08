//Remove characters from alphanumeric string
//https://www.geeksforgeeks.org/problems/remove-characters-from-alphanumeric-string0648/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n)
//Space complexity: O(n)

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeCharacters(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeCharacters(String S) {
        // code here
        String res="";
        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i)<=57 && S.charAt(i)>=48)
            {
                res+=S.charAt(i);
            }
        }
        return res;
    }
}
