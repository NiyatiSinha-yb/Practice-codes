//1290. Convert Binary Number in a Linked List to Integer
//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
//Time complexity: O(n)
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
    public int getDecimalValue(ListNode head) {
        ListNode copy=head;
        int numOfNodes=0;
        int binary=0;
        while(copy!=null)
        {
            numOfNodes++;
            copy=copy.next;
        }
        copy=head;
        int place=numOfNodes-1;
        while(copy!=null)
        {
            binary+=copy.val*(int)Math.pow(2,place--);
            //System.out.println(binary);
            copy=copy.next;
        }
        return binary;
    }
}
