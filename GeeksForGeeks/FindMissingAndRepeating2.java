//Two Pass Algorithm
//Time Complexity: O(n)
//Space Complexity: O(n)
//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1#
//Find Missing And Repeating 


// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

// Initial Template for Java
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        long missing=0;
        int duplicate=0;
        int arrFlags[]=new int[n];
        
        for(int i=0;i<arr.length; i++)
        {
            arrFlags[arr[i]-1]++;
            if(arrFlags[arr[i]-1]==2)
                duplicate=arr[i];
        }
        
        for(int i=0;i<arr.length; i++)
        {
            if(arrFlags[i]==0)
                missing=i+1;
        }
        
        
        
        int res[]={(int)duplicate,(int)missing};
        return res;
    }
}
