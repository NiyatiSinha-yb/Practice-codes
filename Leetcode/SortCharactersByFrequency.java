//https://leetcode.com/problems/sort-characters-by-frequency/submissions/
//451. Sort Characters By Frequency
//Time Complexity: O(s.length^3)
//Space Complexity: O(s.length)

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++)
        {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            max=Math.max(max,map.get(s.charAt(i)));
            min=Math.min(min,map.get(s.charAt(i)));
        }
        String res="";
        for(int i=max; i>=min; i--)
        {
            for(Map.Entry<Character,Integer> element:map.entrySet())
            {
                if(element.getValue()==i)
                {
                    
                    for(int j=1;j<=i; j++)
                    {
                        res+=element.getKey();
                    }
                }
            }
           
        }
        
        return res;
        
    }
}
