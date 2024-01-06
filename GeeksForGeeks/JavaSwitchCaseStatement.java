//Java Switch Case statement
//https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1?page=2&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int choice = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            List<Double> arr = new ArrayList<Double>();
            for(int i = 0;i < choice;i++)
                arr.add(Double.parseDouble(a[i]));
            
            Solution ob = new Solution();
            if(choice == 1)
                System.out.println(String.format("%.2f", ob.switchCase(choice, arr)));
            else
                System.out.println((int)ob.switchCase(choice, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
        switch(choice){
            case 1: return Math.PI*arr.get(0)*arr.get(0);
            case 2: return arr.get(0)*arr.get(1);
        }
        return 0;
    }
}
