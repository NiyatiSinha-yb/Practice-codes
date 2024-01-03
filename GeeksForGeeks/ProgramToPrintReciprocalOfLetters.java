//Program to print reciprocal of letters
//https://www.geeksforgeeks.org/problems/program-to-print-reciprocal-of-letters36233623/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(length of S)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            String reciprocal = ob.reciprocalString(S);
            System.out.println(reciprocal);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String reciprocalString(String S){
        // code here
        String res="";
        for(int i=0; i<S.length(); i++)
        {
            char temp=S.charAt(i);
            if(temp>='a' && temp<='z')
            {
                res+=(char)('a'+'z'-temp);
            }
            else if(temp>='A' && temp<='Z')
            {
                res+=(char)('A'+'Z'-temp);
            }
            else
                res+=temp;
        }
        return res;
    }
}
