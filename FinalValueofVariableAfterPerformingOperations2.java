//2011. Final Value of Variable After Performing Operations
//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
//time Complexity: O(n)
//Space Complexity : O(1)

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0; i<operations.length; i++)
        {
           //as the value of x not being used between the post fix and pre fix operations thus there is no difference if we apply either postfix or prefix
            //because we are using the value in the next statement only
            if(operations[i].charAt(1)=='-')
                x--;
            else
                x++;
            
        }
         return x;
    }
}
