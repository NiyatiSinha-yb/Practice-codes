//Sum Of Digit Is Pallindrome Or Not
//https://www.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy

//Time Complexity: O(log n)
//Space complexity: O(n)
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
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int reverse(int N)
    {
        int rev=0;
        int rem=0;
        while(N!=0)
        {
            rem=N%10;;
            rev=rev*10+rem;
            N=N/10;
            //System.out.println("in rev="+rev);
        }
        //System.out.println("rev="+rev);
        return rev;
    }
    int checkPalin(int n)
    {
        if(n==reverse(n))
            return 1;
        return 0;
    }
    int isDigitSumPalindrome(int N) {
        // code here
        int sum=0;
        int rem=0;
        while(N!=0)
        {
            rem=N%10;
            N=N/10;
            sum+=rem;
        }
        //System.out.println("Sum="+sum);
        return checkPalin(sum);
    }
}
