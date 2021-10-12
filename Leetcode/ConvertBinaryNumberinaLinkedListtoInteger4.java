//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
//1290. Convert Binary Number in a Linked List to Integer
//Time Complexity: O(n)
//Space Complexity:O(1)

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
    public int getDecimalValue(ListNode head) {
        int binary=0;
        while(head!=null)
        {
            binary= 2*binary+head.val;
            head=head.next;
        }
       return binary;
    }
}
