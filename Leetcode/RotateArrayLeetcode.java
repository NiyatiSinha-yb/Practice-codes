//https://leetcode.com/problems/rotate-array/submissions/
//189. Rotate Array

/time Complexity: O(n)
//Space complexity: O(1)

class Solution {
    public void rotate(int[] nums, int k) {
        int i, temp,j;
        if(nums.length<k)
        {
            k=k%nums.length;
        }
            j=(nums.length-k)-1;
            for(i=0; i<(nums.length-k)/2; i++ )
            {
                temp=nums[i];
                nums[i]=nums[j];
                nums[j--]=temp;
            }
            j=nums.length-1;
            for(i=nums.length-k; i<(nums.length-k)+k/2; i++ )
            {
                temp=nums[i];
                nums[i]=nums[j];
                nums[j--]=temp;
            }
            j=nums.length-1;
            for(i=0; i<(nums.length)/2; i++ )
            {
                temp=nums[i];
                nums[i]=nums[j];
                nums[j--]=temp;
            }
        
        
    }
}
