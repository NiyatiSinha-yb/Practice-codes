//Front-Back Transformation - copy
//https://www.geeksforgeeks.org/problems/front-back-transformation1659/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(n)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.convert(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String convert(String s) 
    { 
        String str="";
        int ascii=0;
        for(int i=0; i<s.length(); i++)
        {
            ascii=s.charAt(i);
            
            if(ascii>=65 && ascii<=90)
            {
                //System.out.println(ascii);
                int temp='Z'-s.charAt(i);
                //System.out.println("temp= "+temp+", "+ (char)temp);
                str+=(char)('Z'-s.charAt(i)+'A');
                //System.out.println("str= "+str);
            }
            else if(ascii>=97 && ascii<=122)
            {
                //System.out.println(ascii);
                str+=(char)('z'-s.charAt(i)+'a');
                //System.out.println("str= "+str);
            }
            
        }
        
        return str;
    }
} 
