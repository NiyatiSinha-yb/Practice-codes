//https://leetcode.com/problems/find-the-duplicate-number/submissions/
//287. Find the Duplicate Number
//One Pass Alorithm 
//tortoise Method
//slow->move 1 fast->move 2  -> slow and fast will alsways meet if there is a cycle in array
//if slow and fast meet; make fast start and move both by 1, the point they meet is the repeated element
//Time Complexity: O(arr.length)
//space Complexity: O(1)
// arr[0]=1
// 1 ->arr[1]=3 -> arr[3]=2 -> arr[2]=4 -> arr[4]=2 -> arr[2]=4 (repeat)
/*
        1-> 3 -> 4 ->  2
                 |     |
                 |__<__|

*/


class Solution {
    public int findDuplicate(int[] arr) {
        int slow=arr[0];
        int fast=arr[0];
        do
        {
          slow=arr[slow];
          fast=arr[arr[fast]];
        }
        while(slow!=fast);
        
        fast=arr[0];
        while(slow!=fast)
        {
          slow=arr[slow];
          fast=arr[fast];
        }
        
        
        return slow;
    }
}
