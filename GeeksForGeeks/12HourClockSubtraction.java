//12 hour clock subtraction
//https://www.geeksforgeeks.org/problems/12-hour-clock-subtraction1708/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

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
            String S[] = read.readLine().split(" ");
            
            int num1 = Integer.parseInt(S[0]);
            int num2 = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.subClock(num1,num2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int subClock(int num1, int num2) {
        // code here
        int res= num1-num2;
        //System.out.println(res);
        res=res%12;
        //System.out.println(res);
        if(res<0)
             res=res+12;
        //System.out.println(res);
        return res;
        
    }
};
