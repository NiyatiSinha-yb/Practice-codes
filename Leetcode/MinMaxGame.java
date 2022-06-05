//
//https://leetcode.com/contest/weekly-contest-296/problems/min-max-game/
//6090. Min Max Game
//Time Complexity: O(n/2+n/4+n/8+...)
//Space Complexity: O(n/2+n/4+n/8+...)

class Solution {
    public int minMaxGame(int[] nums) {
        int res=followAlgo(nums);
        return res;
    }
    
    public int followAlgo(int[] nums)
    {
        if(nums.length==1)
        {
            return nums[0];
        }
        
        int arr[]=new int[nums.length/2];
        //System.out.println("Length of array is "+nums.length/2);
        int index=-1;
        for(int i=0; i<nums.length; i=i+2)
        {
            //System.out.println(arr[0]+" , "+arr[1]);
            if(i==0 || i%4==0)
            {
                arr[++index]=Math.min(nums[i],nums[i+1]);
                 //System.out.println(Math.min(nums[i],nums[i+1]));
            }
            else
               arr[++index]= Math.max(nums[i],nums[i+1]);
        }
        
        return followAlgo(arr);
    }
}
