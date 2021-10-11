//Time Complexity: O(n)
//Space Complexity: O(1)
//206. Reverse Linked List
//https://leetcode.com/problems/reverse-linked-list/

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
    static ListNode last;
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        reverse(head).next=null;
        return last;
    }
    public ListNode reverse(ListNode head)
    {
        
        if(head.next!=null)
        {
            ListNode rev= reverse(head.next);
            rev.next=head;
        }
        if(head.next==null)
        {
            last=head;
        }
        
            return head;
        
    }
}
