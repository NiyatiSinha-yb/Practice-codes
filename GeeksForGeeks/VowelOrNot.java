//Vowel or Not
//https://www.geeksforgeeks.org/problems/vowel-or-not0831/1?page=3&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    static class FastReader{ 
		BufferedReader br; 
		StringTokenizer st; 
  
		public FastReader(){ 
			br = new BufferedReader(new InputStreamReader(System.in)); 
		} 
  
		String next(){ 
			while (st == null || !st.hasMoreElements()){ 
				try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
			} 
			return st.nextToken(); 
		} 
  
		String nextLine(){ 
			String str = ""; 
			try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
			return str; 
		} 
	}
	
    public static void main(String args[])throws IOException
    {
        FastReader sc = new FastReader();
        int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            char c = sc.next().charAt(0); 

            Solution ob = new Solution();
            System.out.println(ob.isVowel(c));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    String isVowel(char c){
        // code here
        String vowel="aeiouAEIOU";
        if(vowel.indexOf(c)==-1)
            return "NO";
        return "YES";
    }
}
