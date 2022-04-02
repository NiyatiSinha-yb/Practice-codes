//6034. Find Triangular Sum of an Array
//https://leetcode.com/contest/biweekly-contest-75/problems/find-triangular-sum-of-an-array/

class Solution {
     int result=0;
     public void calculate(ArrayList <Integer> arr) {
         if(arr.size()==1)
         {
             result=arr.get(0);
             return;
         }
         ArrayList <Integer> res= new ArrayList <Integer> ();
         for(int i=0; i<arr.size()-1; i++)
         {
             int sum=arr.get(i)+arr.get(i+1);
             //System.out.println(sum);
             result=sum%10;
             res.add(result);
             
         }
         calculate(res);
     }
    
    public int triangularSum(int[] nums) {
        ArrayList <Integer> arr= new ArrayList <Integer> ();
        for(int i=0; i<nums.length; i++)
        {
            arr.add(nums[i]);
        }
        calculate(arr);
        
        return result;
    }
}
