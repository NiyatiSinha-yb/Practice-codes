//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
//852. Peak Index in a Mountain Array
//Time Complexity: O(log n)
//Space Complexity: O(1)


class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int max=Integer.MIN_VALUE;
        int low=0;
        int high=arr.length-1;
        int mid=0;
        
        while(mid<=high)
        {
            mid=(low+high)/2;
            
            if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])  //negative slope
            {
                high=mid;
            }
            
            else if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1])  //positive slope
            {
                low=mid;
            }
            
            else
                break;
            
        }
        
        return mid;
        
    }
}
