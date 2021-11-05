//time Complexity: O(n^3 log n) //faster due to break
//Space complexity: O(n)
//https://leetcode.com/problems/string-matching-in-an-array/submissions/
//1408. String Matching in an Array

class Solution {
    public List<String> stringMatching(String[] words) {
        List <String> res= new ArrayList<String>();
        for(int i=0; i<words.length; i++)
        {
            for(int j=0; j<words.length; j++)
            {
                if(i==j)
                    continue;
                if(words[j].contains(words[i]))
                {
                    if(!res.contains(words[i]))
                    {
                        res.add(words[i]);
                        break;
                    }
                }
                    
            }
        }
        return res;
    }
}
