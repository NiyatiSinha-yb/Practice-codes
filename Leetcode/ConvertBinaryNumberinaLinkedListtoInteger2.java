//1290. Convert Binary Number in a Linked List to Integer
//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
//time Complexity: O(n)
//Space Complexity:O(n)// for the stack memory due to recursive calls

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int countNode=0;
     int bin=0;
    public void calcBinary(ListNode head){
          
        if(head==null)
            return;
        calcBinary(head.next);
        bin+=+head.val*(int)Math.pow(2,countNode++); 
        
    }
    public int getDecimalValue(ListNode head) {
        int binary=0;
        calcBinary(head);
        return bin;
       
    }
}
