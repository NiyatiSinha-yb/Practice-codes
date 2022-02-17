//Time Complexity: O(n*m)
//Space Complexity: O(n)
//https://leetcode.com/problems/next-greater-element-i/
//496. Next Greater Element I
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]= new int[nums1.length];
        for(int i=0; i<nums1.length; i++)
        {
            int max=Integer.MIN_VALUE;
            int j=0;
            for(j=0; j<nums2.length; j++)
            {
                if(nums1[i]==nums2[j])
                    break; 
            }
            max=nums1[i];
            
            for(int k=j+1; k<nums2.length; k++)
            {
                if(max<nums2[k])
                {
                    max=nums2[k];
                    break;
                }
            }
            
            if(max>nums1[i])
                res[i]=max;
            else
                res[i]=-1;
        }
        return res;
    }
}
