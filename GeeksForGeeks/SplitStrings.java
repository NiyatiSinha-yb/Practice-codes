//Split Strings
//https://www.geeksforgeeks.org/problems/split-strings5211/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n)
//Space complexity: O(n)

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        List<String> res= new ArrayList<String>();
        String S1="";
        String S2="";
        String S3="";
        char temp=' ';
        
        for(int i=0; i<S.length(); i++)
        {
            temp=S.charAt(i);
            if(temp>=48 && temp<=57)
            {
                S2+=temp;
            }
            else if((temp>=65 && temp<=90)||(temp>=97 && temp<=122))
            {
                S1+=temp;
            }
            else
            {
                S3+=temp;
            }
        }
        res.add(S1);
        res.add(S2);
        res.add(S3);
        return res;
        
    }
} 
