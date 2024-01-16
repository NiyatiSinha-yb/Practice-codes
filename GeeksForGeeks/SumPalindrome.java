//Sum Palindrome
//https://www.geeksforgeeks.org/problems/sum-palindrome3857/1?page=1&status=unsolved,attempted&sortBy=difficulty
//Time Complexity: O(n*k), where k<5
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int checkPalin(long n)
    {
         
        long rev=makePalin(n);
        
        if(rev==n)
            return 1;
        return 0;
    }
    
    static long makePalin(long n)
    {
        long copy=n;
        long rem=0;
        long rev=0;
        
        while(copy!=0)
        {
           rem=copy%10;
           copy=copy/10;
           rev=rev*10+rem;
        }
        
        return rev;
    }
  
    static long isSumPalindrome(long n){
        // code here
         long res=0;
         if (checkPalin(n)==1)
            {
                return n;
            }
        res=n;
        
        for(int i=0; i<5; i++)
        {
            
            res=res+makePalin(res);
            //System.out.println(res);
            
            if (checkPalin(res)==1)
            {
                return res;
            }
        }
        
        return -1;
    }
}
