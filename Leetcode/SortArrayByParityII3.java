//Time Complexity: O(n)
//Spcae complexity: O(1)
//922. Sort Array By Parity II
//https://leetcode.com/problems/sort-array-by-parity-ii/



class Solution {
    public int[] sortArrayByParityII(int[] A) {
        
        int even=0;
        int i=0;
         
         for ( i=0; i < A.length; i++ )
         {
           if(A[i]%2==0 && i%2==1)
           {  
               int temp=A[i];
               while(A[even]%2==0)
                {
                    even=even+2;
                  
                }
               A[i]=A[even];
               A[even]=temp;
               even=even+2;   
           }
        }
        return A;
    }
}
