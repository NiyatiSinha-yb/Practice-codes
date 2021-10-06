//https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/
//Time Complexity: O(n)
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=head;
        
        int count=1;
        while(start.next!=null)
        {
            start=start.next;
            count++;
        }
        start=head;
        if(n==1 && count==1)
            return null;
        if(n==count)
            return start.next;
        
        
        for(int i=1; i<count-n; i++)
        {
            start=start.next;
        }
        if(n==1)
            start.next=null;
        else
            start.next=start.next.next;
        return head;
        
    }
}
