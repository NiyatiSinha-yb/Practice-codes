//https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
//1897. Redistribute Characters to Make All Strings Equal
//Time Complexity:O(n^2)
//Space Complexity: O(1)



class Solution {
    public boolean makeEqual(String[] words) {
        int arr[]= new int[26];
        int avg=0;
        for(String str: words)
        {
            avg+=str.length();
        }
        if(avg%words.length!=0)
            return false;
        
        avg=avg/words.length;
        
        for(String str: words)
        {
            for(int i=0; i<str.length(); i++)
            {
                arr[(int)str.charAt(i)-97]++;
                
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%words.length!=0)
                return false;
        }
        return true;
        
        
        
       
    
        
    }
}
