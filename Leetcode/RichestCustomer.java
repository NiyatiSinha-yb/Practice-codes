
//Time Complexity: O(n*m)
//Space Complexity: O(1)
//https://leetcode.com/problems/richest-customer-wealth/submissions/
class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int wealth=0,maxWealthTillNow=0;
        for(int i=0; i<accounts.length; i++)
        {
            for(int j=0; j<accounts[0].length;j++)
            {
                wealth+=accounts[i][j];
            }
            if(wealth>maxWealthTillNow)
            {
                maxWealthTillNow=wealth;
            }
            wealth=0;
        }
        return maxWealthTillNow;
    }
}
