class Solution2 {
   
    public int minOperations(int n) {
    
        int m=n/2;
        if(n%2==0)
            return (m)*(m); //sum of first m odd numbers here m=n/2
        else
            return (m)*(m+1); //sum of first m even numbers here m=n/2
        
    }
}
//You are here! Your runtime beats 100.00 % of java submissions.
//Your memory usage beats 39.58 % of java submissions.
