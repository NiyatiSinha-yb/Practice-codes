//April-LeetCode-Challenge-2021/ 1.PalindromeLinkedList/ UsingRecursion.java
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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null)
            return true; // empty linkedkist or single node lisnkedlist is treated as palindrome
        
        
        ListNode slow = head;
        ListNode fast = head;
        
        int countHalf=0;
        
        
        //System.out.println(slow.val+", "+fast.val+","+countHalf);
        
           
        
        while( fast.next!=null && fast.next.next!=null )
        {

            slow=slow.next;
            countHalf++;
            fast=fast.next.next;
           
            //System.out.println(slow.val+", "+fast.val+","+countHalf);
           
        }
        
        if(fast.next!=null && fast.next.next==null) //even
            countHalf++;
        //System.out.println("head="+head.val+", lastPartFirst="+slow.next.val+", countHalf="+countHalf);
        
        if(palin ( head , slow.next, countHalf)==null)
            return false;
        else
            return true;
        

        
    }
    
     ListNode palin ( ListNode head, ListNode compareStart, int c)
     {
         
         if(head!=null)
         {
             if(c!=1)
                 head=palin(head, compareStart.next, --c);
             if(head==null)
                 return head;
             
             if(head.val==compareStart.val)
             {
                 head=head.next;
             }
             else
                 head=null;
             return head;
         }
         else if (c==1)
             return head;
         else
             return head;
     }
    
}
