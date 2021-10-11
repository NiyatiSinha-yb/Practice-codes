//https://leetcode.com/problems/reverse-linked-list/
//206. Reverse Linked List
//Time Complexity: O(n)
//Space Complexity: O(1)

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
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode ptr=head;
        ListNode prev=null;
        ListNode pres=null;
        
        
        while(ptr.next!=null)
        {
            pres=ptr;
            ptr=ptr.next;
            pres.next=prev;
            prev=pres;
        }
        ptr.next=prev;
        //now ptr points to last node
        //and prev points to second last node
        return ptr;
    }
}

