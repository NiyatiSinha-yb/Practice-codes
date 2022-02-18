//https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
//1374. Generate a String With Characters That Have Odd Counts
//Time complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public String generateTheString(int n) {
        StringBuilder res= new StringBuilder();
        for(int i=0; i<n-1; i++)
            {
                res.append("o");
            }
        if(n%2==1)
           res.append("o"); 
        else
            res.append("e");
        
        return res.toString();
    }
}
