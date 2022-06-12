//5259. Calculate Amount Paid in Taxes
//https://leetcode.com/contest/weekly-contest-297/problems/calculate-amount-paid-in-taxes/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double res=0.0;
        for(int i=0; i<brackets.length; i++)
        {
          
            if(income>0)
            {
                int taxOn=0;
                if(i!=0)
                    taxOn-=brackets[i-1][0];
                if(brackets[i][0]>income)
                    taxOn+=income;
                else
                    taxOn+=brackets[i][0];
                
                
                if(taxOn<=0)
                    break;
                    
                
                //System.out.println("taxOn "+taxOn+" by "+ brackets[i][1]+" percentage yeilds=" + (taxOn*brackets[i][1])/100.00 +  " and now left income is="+ income);
                res+=(taxOn*brackets[i][1])/100.00;
                
                //income-=taxOn;
            }
        }
        return res;
    }
}
