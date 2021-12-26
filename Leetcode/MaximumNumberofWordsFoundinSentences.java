//2114. Maximum Number of Words Found in Sentences
//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/
//Time Complexity: O(sum of length of all sentences)
//Space Complexity: O(1)

class Solution {
    public int mostWordsFound(String[] sentence) {
        int maxCount=0;
        for(int i=0; i<sentence.length; i++)
        {
            int j=0;
            int count=1;
            while(j<sentence[i].length())
            {
                System.out.println(sentence[i].charAt(j));
                if(sentence[i].charAt(j)==' ')
                {
                    count++;
                }
                j++;
            }
            System.out.println(count);
            if(count>maxCount)
                maxCount=count;
        }
        return maxCount;
    }
}
