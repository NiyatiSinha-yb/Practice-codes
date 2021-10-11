//21. Merge Two Sorted Lists
//https://leetcode.com/problems/merge-two-sorted-lists/
//Time Complexity: O(n+m)
//Space complexity: O(n+m)

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        
        else if(l1.val<l2.val){
            head=l1;
            l1=l1.next;
        }
        else{
            head=l2;
            l2=l2.next;
        }
        ListNode copy=head;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val){
                copy.next=l1;
                copy=copy.next;
                l1=l1.next;
            }
            else{
                copy.next=l2;
                copy=copy.next;
                l2=l2.next;
            }
        }
        //System.out.println(l1+"**"+l2);
        if(l2!=null)
        {
            //System.out.println("**");
            copy.next=l2;
        }
        else
            copy.next=l1;
        
        return head;
    }
}
