//https://leetcode.com/submissions/detail/610510786/
//1491. Average Salary Excluding the Minimum and Maximum Salary
//Time complwxity: O(n)
//Space Complexity: O(1)

class Solution {
    public double average(int[] salary) {
        int sum=salary[0];
        int min=salary[0];
        int max=salary[0];
        int temp=salary[0];
        for(int i=1; i<salary.length; i++)
        {
            temp=salary[i];
            sum+=temp;
            if(temp<min)
            {
                min=temp;
            }
            if(temp>max)
            {
                max=temp;
            }
        }
        sum = sum-max-min;
        int no=salary.length;
        /*
        if(max==min)
            no=no-1;
        else
        */ 
        //this condition never arrises as salaries are unique in a contraint in question
            no=no-2;
        System.out.println(max+", "+min+" ,"+no+" ,"+ sum);
        return (double)sum/(double)no;
    }
}
