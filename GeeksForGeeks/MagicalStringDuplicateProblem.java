//Magical String[Duplicate Problem]
//https://www.geeksforgeeks.org/problems/magical-string3653/1?page=1&difficulty=School,Basic&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n)
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
            System.out.println(ob.magicalString(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String magicalString(String S){
        // code here
        String res="";
        char temp=' ';
        for(int i=0; i< S.length(); i++)
        {
            temp=S.charAt(i);
            if(temp>=65 && temp<=90)
            {
                res+=(char)('Z'-(temp-'A'));
            }
            else
            {
                res+=(char)('z'-(temp-'a'));
            }
        }
        return res;
    }
}
