//time Complexity: O(1)
//space complexity: O(1)
//237. Delete Node in a Linked List
//https://leetcode.com/problems/delete-node-in-a-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       node.val=node.next.val;
        node.next=node.next.next;
    }
}
