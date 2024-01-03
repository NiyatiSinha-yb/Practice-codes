//https://www.geeksforgeeks.org/problems/c-input-output2432/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
//C++ Input / Output
//Time Complexity: O(1)
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
            String[] inp=read.readLine().split(" ");
            int A=Integer.parseInt(inp[0]);
            int B=Integer.parseInt(inp[1]);
            Solution ob = new Solution();
            System.out.println(ob.multiplication(A,B));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int multiplication(int A, int B){
        // code here
        return A*B;
    }
}

