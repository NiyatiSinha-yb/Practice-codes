//Count of camel case characters
//https://www.geeksforgeeks.org/problems/find-the-camel3348/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(S.length())
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countCamelCase (s));
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countCamelCase (String s)
    {
        // your code here   
        int c=0;
        for(int i=0;i<s.length(); i++)
        {
            if(65<=s.charAt(i) && s.charAt(i)<=90)
            {
                c++;
            }
        }
        return c;
    }
}
