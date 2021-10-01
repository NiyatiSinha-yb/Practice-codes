//Time Complexity: O(n log n)
//Space Complexity: O(1)
//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/

class Solution {
    public int thirdMax(int[] arr) {
        Arrays.sort(arr);
        int prev=arr[arr.length-1];
        int count=0;
        for(int i=arr.length-2; i>=0; i--)
        {
            if(arr[i]!=prev)
            {
                prev=arr[i];
                count++;
                if(count==2)
                    return arr[i];
            }   
        }
        return arr[arr.length-1];
    }
}
