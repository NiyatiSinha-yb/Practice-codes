//https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
//1374. Generate a String With Characters That Have Odd Counts
//Time complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public String generateTheString(int n) {
        String res="";
        for(int i=0; i<n-1; i++)
            {
                res+="o";
            }
        if(n%2==1)
           res+="o"; 
        else
            res+="e";
        
        return res;
    }
}
