//Pattern 6
//https://www.geeksforgeeks.org/problems/triangle-number-1661489840/1?page=4&difficulty=School,Basic&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n^2)
//Space complexity: O(1)

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0; i<n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
