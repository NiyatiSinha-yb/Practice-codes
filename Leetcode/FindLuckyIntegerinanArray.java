//Time Complexity: O(n log n) -> sort
//Space Complexity: O(1)
//1394. Find Lucky Integer in an Array
//https://leetcode.com/problems/find-lucky-integer-in-an-array/submissions/

class Solution {
    public int findLucky(int[] arr) {
        
        Arrays.sort(arr);
        int prev=arr[arr.length-1];
        int count=1;
        
        for(int i=arr.length-2; i>=0; i--){
            
            if(arr[i]==prev){
                count++;
                //System.out.println(arr[i]+", "+ count);
            }
            
            else{
                if(count==prev)
                    return prev;
                count=1;
            }
            
            prev=arr[i];
            
            if(i==0)
            {
                if(count==prev)
                    return prev;
            }
        }
        return -1;
        
    }
}
