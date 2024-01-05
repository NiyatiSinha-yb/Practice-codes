//Java loops | Set 1
//https://www.geeksforgeeks.org/problems/java-loops-set-11726/1?page=2&difficulty=School&status=unsolved&sortBy=accuracy

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
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {
            int N = scn.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> sum = ob.getSum(N);
            System.out.println(sum.get(0)+" "+sum.get(1));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> getSum(int N){
        // code here
        ArrayList<Integer> arr= new ArrayList<Integer>();
        int odd;
        int even;
        if(N%2==0){
            odd=N/2;
            even=odd;
        }
        else
        {
            odd=N/2+1;
            even= N/2;
        }
        arr.add(even*(even+1));
        arr.add((odd*odd));
        return arr;
    }
}
