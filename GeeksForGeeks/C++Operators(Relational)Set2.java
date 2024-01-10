//C++ Operators (Relational) | Set 2
//https://www.geeksforgeeks.org/problems/c-operators-relational-set-21407/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java
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
            String[] inp=read.readLine().split(" ");
            int A=Integer.parseInt(inp[0]);
            int B=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.compareNum(A,B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String compareNum(int A, int B){
        // code here
        if(A==B)
            return A+" is equals to "+B;
        return A>B?A+" is greater than "+B: A+" is less than "+B;
    }
}
