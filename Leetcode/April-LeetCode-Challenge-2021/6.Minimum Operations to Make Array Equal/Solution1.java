class Solution1 {
   
    public int minOperations(int n) {
    
        /* applicable only for even number of n i.e. even number of nodes
        for(int i=0; i<n/2; i++){
            count=count+2*i+1;
        }
        */
        if(n%2==0)
            return (n/2)*(n/2); //sum of first m odd numbers here m=n/2
        else
            return (n/2)*(n/2+1); //sum of first m even numbers here m=n/2
        
    }
}
/*
Your runtime beats 100.00 % of java submissions
Your memory usage beats 97.13 % of java submissions
*/
