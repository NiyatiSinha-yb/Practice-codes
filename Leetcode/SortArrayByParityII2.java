//Time Complexity: O(n)
//Spcae complexity: O(1)
//922. Sort Array By Parity II
//https://leetcode.com/problems/sort-array-by-parity-ii/

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j=1;
        //find first wrong odd & then search for first wrong even ; swap ;continue the loop again
         for (int i = 0; i < A.length; i += 2)
         {
            if (A[i] % 2 == 1) //wrong odd (odd present where even was required)
            {
                while(A[j]%2==1)//true when right odd
                {
                    j=j+2;
                }
                //breaks at index j which has  wrong even
                
                //A[i] is wrong odd
                //A[j] is wrong even
                //swap to get at correct positions
                
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
    
        return A;
    }
}
