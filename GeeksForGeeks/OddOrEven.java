//Odd or Even
//https://www.geeksforgeeks.org/problems/odd-or-even3618/1?page=2&difficulty=School&sortBy=submissions
//Space Complexity: O(1)
//Time Complexity: O(1)

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
            System.out.println(ob.oddEven(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String oddEven(int N){
        // code here
        if(N%2==0)
            return "even";
        return "odd";
    }
}
