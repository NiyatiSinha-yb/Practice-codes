//5299. Find the K-Beauty of a Number
//https://leetcode.com/contest/biweekly-contest-78/problems/find-the-k-beauty-of-a-number/
//Time Complexity: O(k*(n-k))
//Space complexity: O(1)

class Solution {
    public int divisorSubstrings(int num, int k) {
        String n= ""+num;
        String sub="";
        int i,j;
        int res=0;
        for(i=0; i<n.length()-k+1;i++)
        {
            sub="";
            for(j=i; j<i+k && j<n.length(); j++)
            {
                sub+=n.charAt(j);
            }
            System.out.println("sub "+ sub);
            
            if(Integer.parseInt(sub)!=0 && num % Integer.parseInt(sub)==0)
            {
                System.out.println("sub divisible "+ sub);
                res++;
            }
            System.out.println();
        }
        return res;
    }
}
