//2011. Final Value of Variable After Performing Operations
//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
//time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0; i<operations.length; i++)
        {
            if(operations[i].charAt(0)=='X')
            {
                if(operations[i].charAt(1)=='+')
                    x++;
                else
                    x--;
            }
            else{
                if(operations[i].charAt(0)=='+')
                    ++x;
                else
                    --x;
                
            }
        }
         return x;
    }
}
