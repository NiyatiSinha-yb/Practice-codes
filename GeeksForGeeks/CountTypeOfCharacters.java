//Count type of Characters
//https://www.geeksforgeeks.org/problems/count-type-of-characters3635/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(n)
//Space complexity: O(n)

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
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here    
        int arr[]= new int[4];
        //uppercase
        //lowercase
        //numeric
        //special
        for(int i=0; i<s.length(); i++)
        {
            if(97<=s.charAt(i) && s.charAt(i)<=122)
                arr[1]++;
            else if(65<=s.charAt(i) && s.charAt(i)<=90)
                arr[0]++;    
            else if(48<=s.charAt(i) && s.charAt(i)<=57)
                arr[2]++; 
            else 
                arr[3]++;
        }
        return arr;
    }
}
