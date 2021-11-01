//Time Complexity: O(n)
//Space Complexity: O(1)
//141. Linked List Cycle
//https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
           ListNode oneMoveAtATime= head;
        ListNode twoMoveAtATimeStartHead= head;
        //System.out.println(oneMoveAtATime.val);
        while(oneMoveAtATime!=null && twoMoveAtATimeStartHead!=null)
        {
            oneMoveAtATime=oneMoveAtATime.next;
            twoMoveAtATimeStartHead=twoMoveAtATimeStartHead.next;
            //System.out.println(oneMoveAtATime.val);
            if(twoMoveAtATimeStartHead!=null)
                twoMoveAtATimeStartHead=twoMoveAtATimeStartHead.next;
           
            if(oneMoveAtATime==twoMoveAtATimeStartHead && twoMoveAtATimeStartHead!=null)
                return true;
   
        }
        return false;
    }
}
