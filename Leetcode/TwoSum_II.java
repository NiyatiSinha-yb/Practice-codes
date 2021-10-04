//time Compleity : O( n )
// Space complexity : O ( 1)
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int front=0; 
        int rear=numbers.length-1;
        int res[]= new int[2];
        while(front<rear)
        {
            if(numbers[front]+numbers[rear]>target)
            {
                //System.out.println(numbers[front]+" + "+ numbers[rear]+ ">"+ target);
                rear--;
            }
            else if(numbers[front]+numbers[rear]<target)
            {
                  //System.out.println(numbers[front]+" + "+ numbers[rear] +"<"+ target);
                front++;
            }
            else if(numbers[front]+numbers[rear]==target)
            {
                 //System.out.println(numbers[front]+" + "+ numbers[rear]+ "=="+ target);
                res[0]=front+1;
                res[1]=rear+1;
                return res;
            }
        }
        return res;
    }
}
