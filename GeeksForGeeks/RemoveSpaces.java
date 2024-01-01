//Remove Spaces
//https://www.geeksforgeeks.org/problems/remove-spaces0128/1?page=1&difficulty=School&status=unsolved&sortBy=submissions

//Time Complexity: O(length of n)
//Space Complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s;
            s = br.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String modify(String S)
    {
        // your code here
        String res="";
        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i)!=' ')
                res+=S.charAt(i);
        }
        return res;
    }
}
