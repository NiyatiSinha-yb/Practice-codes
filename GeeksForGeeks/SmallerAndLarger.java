//Smaller and Larger
//https://www.geeksforgeeks.org/problems/smaller-and-larger4005/1?page=1&difficulty=School&status=unsolved&sortBy=submissions

//Time complexity: O(N)
//Space Complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans[] = new Solve().getMoreAndLess(arr, n, x);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}


// } Driver Code Ends


//User function Template for Java




class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int res[]= new int[2];
        res[0]=0;
        res[1]=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<=x)
                res[0]++;
            if(arr[i]>=x)
                res[1]++;
        }
        return res;
    }
}
