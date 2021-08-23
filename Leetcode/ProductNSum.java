//Time Complexity: O(log n base 10)
//Space Complexity: O(1)
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/

class ProductNSum {
    
    public int subtractProductAndSum(int n) {
        int p=1,s=0,i;
        while(n!=0)
        {
            i=n%10;
            p*=i;
            s+=i;
            n=n/10;
        }
        return p-s;
    }
}
