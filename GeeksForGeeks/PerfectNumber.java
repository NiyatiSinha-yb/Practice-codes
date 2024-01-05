//Perfect Number
//https://www.geeksforgeeks.org/problems/perfect-number3759/1?page=2&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(log N)
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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPerfect(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int fact(int N)
    {
        int f=1;
        for(int i=1; i<=N; i++)
        {
            f*=i;
        }
        return f;
    }
    
    int isPerfect(int N) {
        // code here
        int copy=N;
        int sum=0;
        int rem=0;
        while(copy!=0)
        {
            rem=copy%10;
            copy=copy/10;
            sum+=fact(rem);
            if(sum>N)
                return 0;
        }
        if(sum==N)
            return 1;
        return 0;
    }
}
