//Automorphic Number
//https://www.geeksforgeeks.org/problems/automorphic-number4721/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_AutomorphicNumber(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //This code is when the square needs to have the whole original number as its trailing digits
    /*public int countNumOfDigits(int n)
    {
        int i=0;
        while(n!=0)
        {
            n=n/10;
            i++;
        }
        return i;
    }
    public String is_AutomorphicNumber(int n)
    {
        // Code here
        int sq=n*n;
        int i=countNumOfDigits(n);
        int no=sq%((int)Math.pow(10,i));
        
        System.out.println(sq+", "+no);
        if(no==n)
            return "Automorphic";
        return "Not Automorphic";
    }*/
    
     public String is_AutomorphicNumber(int n)
    {
        // Code here
        int sq=n*n;
        if(sq%10==n%10)
            return "Automorphic";
        return "Not Automorphic";
    }
    
}
