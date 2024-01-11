//Choice
//https://www.geeksforgeeks.org/problems/choice/1?page=1&difficulty=School,Basic,Easy,Medium&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
       
        while(t-- > 0){
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a;
            a = Integer.parseInt(st.nextToken());
            
            int b;
            b = Integer.parseInt(st.nextToken());
            
            int c;
            c = Integer.parseInt(st.nextToken());
            
            Solution obj = new Solution();
            int ans[]=obj.arrayForm(a,b,c);
            for(int i=0;i<ans.length;i++)
             {
                 System.out.print(ans[i]+" ");
             }
            System.out.println();
            String ans2=obj.stringForm(a,b,c);
            System.out.println(ans2);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
 
    int [] arrayForm(int a, int b, int c) {
        // code here
        int arr[]=  new int []{a,b,c};
        return arr;
       
    }

    String stringForm(int a, int b, int c) {
        // code here
        return a+""+b+""+c;
       
    }
}
