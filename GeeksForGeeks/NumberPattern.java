//Number Pattern
//https://www.geeksforgeeks.org/problems/number-pattern0517/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(N^2)
//Space complexity: O(N)

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            Solution ob = new Solution();
            ArrayList<String> res = ob.numberPattern(N);
            for (int i = 0; i < res.size(); i++){
			    System.out.print(res.get(i)+" ");
            }
			System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<String> numberPattern(int N){
        // code here
        ArrayList<String> arr = new ArrayList<String>();
        for(int j=1; j<=N; j++)
        {
            String str="";
            for(int i=1; i<=j; i++)
            {
                str+=i;
            }
            for(int i=j-1; i>0; i--)
            {
                str+=i;
            }
            arr.add(str);
            
        }
        return arr;
            
    }
}
