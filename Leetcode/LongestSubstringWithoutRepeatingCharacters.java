//3. Longest Substring Without Repeating Characters
//https://leetcode.com/problems/longest-substring-without-repeating-characters/
//Time Complexity: (n(n+1)/2)
//Space Complexity: O(s.length)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> s1Map= new HashMap <Character,Integer> ();
        int max=0,globalMax=0;
        int counter=0;
        for(int j=0; j<s.length(); j++)
        {
            for(int i=j; i<s.length(); i++)
            {
                //System.out.println(i);
                if(s1Map.containsKey(s.charAt(i)))
                {
                    i=counter+1;
                    s1Map.clear();
                    if(max>globalMax)
                    {
                        globalMax=max;
                    }
                    max=0;
                    //System.out.println(max);
                    //System.out.println();
                    break;
                }
                else
                {
                    max++;
                    s1Map.put(s.charAt(i),1);
                   // System.out.println(s1Map);
                }
               // System.out.println("*"+max);
            }
            
        }
        if(max>globalMax)
            {
                globalMax=max;
            }
        return globalMax;
    }
}
