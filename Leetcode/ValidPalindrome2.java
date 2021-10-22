//Time Complexity: O(n/2)
//Space Complexity: O(1)
//125. Valid Palindrome
//https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        s=s.toLowerCase();
        int end=s.length()-1;
        
        char first=s.charAt(start);
        
        char last=s.charAt(end);
        
        while(start<=end)
        {
            // System.out.println("Before While1 : "+ first +" , "+last+" , "+start+" , "+end);
            while(!((first<=122 && first>=97) || (first<=90 && first>=65) || (first<=57 && first>=48))&& start<end)
            {
               // System.out.println("in While : "+ first +" , "+last+" , "+start+" , "+end);
                start++;
                first=s.charAt(start);
            }
           // System.out.println("After While : "+ first +" , "+last+" , "+start+" , "+end);
            
            // System.out.println("Before While2 : "+ first +" , "+last+" , "+start+" , "+end);
             while(!((last<=122 && last>=97) || (last<=90 && last>=65) || (last<=57 && last>=48)) && end>start)
            {
                //System.out.println("in While : "+" , "+first+" , "+ last +" , "+start+" , "+end);
                end--;
                last=s.charAt(end);
            }
            //System.out.println("Before Conditional checking : "+ first +" , "+last+" , "+start+" , "+end+"\n");
            
            if(first==last && start!=end)
            {
                start++;
                first=s.charAt(start);
                end--;
                last=s.charAt(end);
            }
            else if(first==last && start==end)
            {
                //System.out.println(start+","+first);
                return true;
            }
            else
            {
                return false;
            }
        }
        return true;
        
    }
}
