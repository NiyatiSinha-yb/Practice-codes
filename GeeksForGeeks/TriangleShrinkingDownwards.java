//Triangle shrinking downwards
//https://www.geeksforgeeks.org/problems/triangle-shrinking-downwards0459/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(n^2)
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
            String S = read.readLine();

            Solution ob = new Solution();
            
            String ans = ob.triDownwards(S);
            
            for(int i=0 ; i<ans.length() ; i++)
            {
                System.out.print(ans.charAt(i));
                if((i+1)%S.length()==0)
                    System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String triDownwards(String S){
        // code here
        String str="";
        for(int i=0; i<S.length(); i++)
        {
            for(int j=0; j<i; j++)
            {
               str+="."; 
            }
            str+=S.substring(i);
        }
        return str;
    }
}

