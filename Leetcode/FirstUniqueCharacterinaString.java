//Time Complexity: O(n log n)
//Space Complexity: O(n)
//387. First Unique Character in a String
//https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character, Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),-1);
            else
                map.put(s.charAt(i),i);
        }
        
        //System.out.println(map);
        
         int minIndex=Integer.MAX_VALUE;
         int flag=-1;
         for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // System.out.println(entry.getValue());
             if(minIndex>entry.getValue() && entry.getValue()>=0)
             {
                 flag=1;
                 minIndex=entry.getValue();
             }
         }
        if(flag==-1) //if(flag==-1 && s.length()>0) -> length is not needed to be checked as the input restriction says that the length of string can be minimum 1 character
            return -1;
        return minIndex;
        
    }
}
