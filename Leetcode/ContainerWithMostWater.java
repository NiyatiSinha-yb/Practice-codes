//Time Complexity: O(n)
//Spcae Complexity: O(1)
//https://leetcode.com/problems/container-with-most-water/
//11. Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int first=0, last=height.length-1;
        
        while(first<last)
        {
            max=Math.max(max, Math.min(height[first],height[last])*(last-first));
            if(height[first]<height[last])
                first++;
            else
                last--;
            
        }
        return max;
    }
}
