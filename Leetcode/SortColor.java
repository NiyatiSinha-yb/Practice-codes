//Time complexity: O(n)
//Space Complexity : O(1)
//https://www.youtube.com/watch?v=oaVa-9wmpns&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=3
//https://leetcode.com/problems/sort-colors/submissions/

class SortColor {
    public void sortColors(int[] arr) {
        int red=0, white=0, blue=0, i;
        for(i=0; i<arr.length; i++)
        {
            //System.out.println(nums[i]==0?red++:nums[i]==1?white++:blue++);
            if(arr[i]==0) red++;
            else if(arr[i]==1) white++;
            else blue++;
        }
        i=0;
        while(red!=0)
        {
            arr[i++]=0;
            red--;
        }
        while(white!=0)
        {
            arr[i++]=1;
            white--;
        }
        while(blue!=0)
        {
            arr[i++]=2;
            blue--;
        }
    }
}
