
import java.io.*;
import java.util.*;

public class OneZero {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            new Solution().segregate0and1(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    void segregate0and1(int[] arr, int n) {
        // code here
        int ZeroMaxIndex=-1;
        for(int i=0; i<n; i++)
        {
            
            if(arr[i]==0)
            {
                ZeroMaxIndex++;
            }
        }
        for(int i=0; i<=ZeroMaxIndex; i++){
            arr[i]=0;
            
        }
        for(int i=ZeroMaxIndex+1; i<n; i++){
            arr[i]=1;
            
        }
        
    }

}
