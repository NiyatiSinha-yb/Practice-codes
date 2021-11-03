//Swap Nodes in Pairs
//https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1681
//Time Complexity: O(n/2)
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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;   
        ListNode second=head.next;
        ListNode third= second.next;
        second.next=head;
        head.next = swapPairs(third);
        return second;
        
        
    }
}
