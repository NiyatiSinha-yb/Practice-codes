//Pattern of Strings
//https://www.geeksforgeeks.org/problems/pattern-of-strings3829/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n^2)
//Space complexity: O(n^2)

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
            String S = read.readLine();
            
            Solution ob = new Solution();
            ArrayList<String> result = ob.pattern(S);
            for(String value : result){
                System.out.println(value);
            }
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> pattern(String S) {
        // code here
        ArrayList<String> arr= new ArrayList<String>();
        String str="";
        for(int i=0; i<S.length(); i++)
        {
            str="";
            for(int j=0; j<S.length()-i; j++)
            {
                str+=S.charAt(j);
            }
            arr.add(str);
        }
        return arr;
    }
};
