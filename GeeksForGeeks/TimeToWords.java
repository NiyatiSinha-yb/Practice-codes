//Time to Words
//https://www.geeksforgeeks.org/problems/time-to-words3728/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int H = Integer.parseInt(input[0]); 
            int M = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.timeToWord(H,M));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public String numToWord(int t)
    {
        String time="";
        switch(t){
            case 1: time="one";
                    break;
            case 2: time="two";
                    break;   
            case 3: time="three";
                    break;
            case 4: time="four";
                    break;
            case 5: time="five";
                    break;
            case 6: time="six";
                    break;
            case 7: time="seven";
                    break;
            case 8: time="eight";
                    break;
            case 9: time="nine";
                    break;
            case 10:time="ten";
                    break;
            case 11: time="eleven";
                    break;
            case 12: time="twelve";
                    break;
            case 13: time="thirteen";
                    break;
            case 14: time="fourteen";
                    break;
            case 15: time="quarter";
                    break;
            case 16: time="sixteen";
                    break;
            case 17: time="seventeen";
                    break;
            case 18: time="eighteen";
                    break;
            case 19: time="nineteen";
                    break;
            case 20: time="twenty";
                    break;
            case 21: time="twenty one";
                    break;
            case 22: time="twenty two";
                    break;
            case 23: time="twenty three";
                    break;
            case 24: time="twenty four";
                    break;
            case 25: time="twenty five";
                    break;
            case 26: time="twenty six";
                    break;
            case 27: time="twenty seven";
                    break;
            case 28: time="twenty eight";
                    break;
            case 29: time="twenty nine";
                    break;
            case 30: time="half";
                    break;
                
        }
        return time;
    }
    public String timeToWord(int H, int M)
    {
        // code here
        if(M==0)
            return numToWord(H)+" o' clock";
        if(M<=30)
        {
            if(M==1)
                return numToWord(M)+" minute past "+numToWord(H);
            else if(M==15 || M==30)
                return numToWord(M)+" past "+numToWord(H);
            else 
                return numToWord(M)+" minutes past "+numToWord(H);
        }
        else
        {
            if(H+1>12)
            {
                H=(H)%12;
            }
            if(60-M==1)
            {
                return numToWord(60-M)+" minute to "+numToWord(H+1);
            }
            else if(60-M==15)
                return numToWord(60-M)+" to "+numToWord(H+1);
            return numToWord(60-M)+" minutes to "+numToWord(H+1);
        }
   
    }
}
