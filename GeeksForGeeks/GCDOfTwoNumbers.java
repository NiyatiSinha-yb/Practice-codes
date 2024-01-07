//GCD of two numbers
//https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy

//Time Complexity: O(log(min(A, B)))
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int A = sc.nextInt();
                    int B = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.gcd(A,B));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
        int a=A;
        int b=B;
        int temp=0;
        while(A!=0)
        {
            temp=B;
            B=A;
            A=temp%A;
        }
        return B;
    } 
}
