//Bubble Sort
//time complexity: O(n^2)
//Space Complexity : O(1)
//https://leetcode.com/problems/sort-an-array/
//912. Sort an Array

class Solution {
    public int[] sortArray(int[] nums) {
        
        int k=0;
        for(int i=0; i<nums.length-k;)
        {
           // System.out.println("\n\n\nThis cycle will go from 0 to max attained index of "+(nums.length-k-1));
             //System.out.println("i="+i);
            for(int j=0; j<nums.length-k-1;j++)
            {
               // System.out.println("Comparision between "+nums[j]+" and " +nums[j+1]);
                if(nums[j]>nums[j+1])
                {
                    
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    //System.out.println("replaced+\n"+Arrays.toString(nums)+"\n");
                }
                //else
                   // System.out.println("not replaced+\n"+Arrays.toString(nums)+"\n");
            }
            k++;
            //System.out.println("k="+k);
        }
        return nums;
    }
}
