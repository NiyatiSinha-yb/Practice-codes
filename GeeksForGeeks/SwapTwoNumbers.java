//Swap two numbers
//https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1?page=1&difficulty=School&status=unsolved&sortBy=submissions
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Solution ob = new Solution();
            List<Integer> ans = ob.get(a,b);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> get(int a,int b)
    {
        // code here
        ArrayList<Integer> res= new ArrayList<Integer>();
        a=a+b;
        b=a-b;
        a=a-b;
        res.add(a);
        res.add(b);
        return res;
    }
}
