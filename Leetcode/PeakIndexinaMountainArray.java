//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
//852. Peak Index in a Mountain Array
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
        
    }
}
