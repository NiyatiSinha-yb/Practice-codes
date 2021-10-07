//567. Permutation in String
//https://leetcode.com/problems/permutation-in-string/
//TimeComplexity: O(length of s1 * (length of s2- length of s1))
//Space Complexity: O(length o s1)

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap <Character,Integer> s1Map= new HashMap <Character,Integer> ();
        if(s1.length()>s2.length())
            return false;
        
        for(int i=0; i<s1.length(); i++)
        {
            if(s1Map.containsKey(s1.charAt(i)))
            {
                s1Map.put(s1.charAt(i),s1Map.get(s1.charAt(i))+1);
            }
            else
                s1Map.put(s1.charAt(i),1);
        }
        //System.out.println(s1Map);
        
        HashMap <Character,Integer> s2Map= new HashMap <Character,Integer> ();
        
        //System.out.println(s2.length()-s1.length());
        for(int i=0; i<=s2.length()-s1.length(); i++)
        {
                
                for(int j=i; j<i+s1.length(); j++)
                {
                    //System.out.println(i+", "+j);
                    if(s2Map.containsKey(s2.charAt(j)))
                    {
                         //System.out.println(s2.charAt(j));
                        s2Map.put(s2.charAt(j),s2Map.get(s2.charAt(j))+1);
                    }
                
                    else
                    {
                        s2Map.put(s2.charAt(j),1);
                    }
                }
             //System.out.println("* "+s2Map);
            if(s2Map.equals(s1Map))
                return true;
             s2Map.clear();
            
        }
       

        return false;
    }
}
