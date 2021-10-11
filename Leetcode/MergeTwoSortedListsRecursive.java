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
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        else {
            ListNode res;
            if(l1.val<=l2.val)
            {
                res=l1;
                l1=l1.next;
            }
            else
            {
                res=l2;
                l2=l2.next;
            }
            sort(l1,l2,res);
            return res;
        }
        
        
    }
    public void sort(ListNode l1, ListNode l2, ListNode res)
    {
         if(l1==null)
            res.next=l2;
        
        else if(l2==null)
            res.next=l1;
        
        else if(l1.val<=l2.val){
            res.next=l1;
            l1=l1.next;
            sort(l1,l2,res.next);
        }
        else{
             res.next=l2;
            l2=l2.next;
            sort(l1,l2,res.next);
        }
    }
}
