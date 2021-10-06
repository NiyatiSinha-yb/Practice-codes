//https://leetcode.com/problems/middle-of-the-linked-list/submissions/
//Time Complexity: O(n/2)
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
    public ListNode middleNode(ListNode head) {
        ListNode start=head;
        ListNode oneOverOther=head;
        while(oneOverOther!=null && oneOverOther.next!=null)
        {
            start=start.next;
            oneOverOther = (oneOverOther.next).next;
        }
        return start;
    }
}
