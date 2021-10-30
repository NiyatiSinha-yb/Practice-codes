//Time Complexity: O(strs.length* strs_String_with_least_length)
//14. Longest Common Prefix
//Space Complexity: O(1)
//https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        int flag=0;
        int wordSize=strs[0].length();
        for(int i=0; i<strs.length; i++)
           {
                if(strs[i].length()<wordSize)
                  wordSize=strs[i].length();
            }
        
           for(int j=0; j<wordSize; j++)
           {
               for(int i=1; i<strs.length; i++)
                {
                  // if(strs[i].length()<wordSize)
                  //     wordSize=strs[i].length();
                   if(strs[i].charAt(j)!=strs[0].charAt(j))
                   {
                       //res+=strs[0].charAt(j);
                       flag=-1;
                       break;
                       
                   }
                }
               if(flag!=-1)
                   res+=strs[0].charAt(j);
               
               //System.out.println(res);
           }
        return res;
    }
}
