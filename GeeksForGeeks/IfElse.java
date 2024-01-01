//C++ if-else (Decision Making)
//https://www.geeksforgeeks.org/problems/c-if-else-decision-making4138/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//time complexity: O(1)
//space complexity: O(1)

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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.compareFive(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String compareFive(int N){
        // code here
        if(N<5)
        {
            return "Less than 5";
        }
        else if(N==5)
        {
            return "Equal to 5";
        }
        return "Greater than 5";
        
    }
}
