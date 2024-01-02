//Check String
//https://www.geeksforgeeks.org/problems/check-string1818/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Time Complexity: O(1)
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
            if (new Sol().check (s))
                System.out.println ("YES");
            else
                System.out.println ("NO");
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean check (String s)
    {
        // your code here     
        char firstChar=s.charAt(0);
        for (int i=1; i<s.length(); i++)
        {
            if(firstChar!=s.charAt(i))
                return false;
        }
        return true;
    }
}
