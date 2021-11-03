//Time Complexity: O(n log n)
//Space Complexity: O(no of distinct elements)
//https://practice.geeksforgeeks.org/problems/anagram-1587115620/1/?company[]=Google&company[]=Google&problemType=functional&page=2&sortBy=submissions&query=company[]GoogleproblemTypefunctionalpage2sortBysubmissionscompany[]Google
//Anagram 

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends




class Solution
{    
    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length())
            return false;
            
        HashMap <Character, Integer> freq= new HashMap<>();
        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                //System.out.println("working on: "+ a.charAt(i)+" , "+b.charAt(i));
                if(freq.containsKey(a.charAt(i)))
                {
                    
                    freq.put(a.charAt(i), freq.get(a.charAt(i))+1);
                    //System.out.println(a.charAt(i)+" , "+((int)freq.get(a.charAt(i))));
                }
                else{
                    freq.put(a.charAt(i), 1);
                    //System.out.println(a.charAt(i)+" , "+1);   
                }
                if(freq.containsKey(b.charAt(i)))
                {
                   // System.out.println(b.charAt(i)+" , "+freq.get(b.charAt(i)));
                    freq.put(b.charAt(i), ((int)freq.get(b.charAt(i))-1));
                    //System.out.println(b.charAt(i)+" , "+freq.get(b.charAt(i)));
                }
                else{
                
                    freq.put(b.charAt(i), -1);
                    //System.out.println(b.charAt(i)+" , "+-1);
                }
            }
        }
        for(Map.Entry freqTraverse: freq.entrySet())
        {
            //System.out.println((int)freqTraverse.getValue());
            if((int)freqTraverse.getValue()!=0)
                return false;
        }
        return true;
        // Your code here
        
    }
}
