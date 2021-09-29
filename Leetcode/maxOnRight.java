//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
//Replace Elements with Greatest Element on Right Side
//Time Complexity : O(n)
//Space Complexity : O(1)

class Solution {
    public int[] replaceElements(int[] arr) {
        int max=arr[arr.length-1];
        int temp;
        for(int i=arr.length-2; i>=0; i--)
        {
            temp=max;
            if(arr[i]>max)
                max=arr[i];
            arr[i]=temp;
        }
        arr[arr.length-1]=-1;
        return arr;
       
    }
}
