
//1491. Average Salary Excluding the Minimum and Maximum Salary
//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/submissions/
//Time Complexity: O(n)
//Space complexity: O(1)

class Solution {
    public double average(int[] salary) {
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0; i<salary.length; i++)
        {
            sum+=salary[i];
            if(max<salary[i])
                max=salary[i];
            if(min>salary[i])
                min=salary[i];
        }
        
        double sumExclusingMinMax=sum-max-min;
        return sumExclusingMinMax/(salary.length-2);
    }
}
