//12 hour clock addition
//https://www.geeksforgeeks.org/problems/12-hour-clock-addition1206/1?page=2&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int num1 = Integer.parseInt(input_line[0]);
            int num2 = Integer.parseInt(input_line[1]);

            Solution ob = new Solution();
            System.out.println(ob.clockSum(num1, num2));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int clockSum(int num1, int num2){
        // code here
        int time= (num1+num2)%12;
        return time;
            
    }
}
