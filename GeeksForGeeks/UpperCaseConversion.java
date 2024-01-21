//Time Limit exceeded for this code

//Upper case conversion
//https://www.geeksforgeeks.org/problems/upper-case-conversion5419/1?page=1&status=unsolved,attempted&sortBy=difficulty
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String transform(String s)
    {
        // code here
        //if flag is set to 1, update letter to upper case 
        int flag=1;
        String res="";
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                //set flag to 1
                flag=1;
                res+=s.charAt(i);
            }
            else if(flag==1)
            {
                //update to upper case
                res+=(char)(s.charAt(i)-32);
                //unset flag to 1
                flag=0;
            }
            else
                res+=s.charAt(i);
            
        }
        return res;
    }
}
