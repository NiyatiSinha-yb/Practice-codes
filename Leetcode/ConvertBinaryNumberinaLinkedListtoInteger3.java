//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/submissions/
//1290. Convert Binary Number in a Linked List to Integer
//time Complexity: O(n)
//Space Complexity: O(n) 



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
    public int calcBinary(ListNode head){
          
        if(head.next==null)
            return head.val;
        return (calcBinary(head.next)+head.val*(int)Math.pow(2,++countNode)); 
        //++countNode because we are not counting the last node
    }
    public int getDecimalValue(ListNode head) {
        
        return calcBinary(head);
       
    }
}
