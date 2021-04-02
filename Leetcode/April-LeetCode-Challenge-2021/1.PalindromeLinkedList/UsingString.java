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
        
        StringBuilder obj= new StringBuilder();

        String firstPart="";
        
        while(head!=null)
        {
            obj.append(head.val);
            head=head.next;
        }
        int len=obj.length();
        
        firstPart=obj.substring(0,len/2);
        
        obj.replace(0,len,obj.substring((len+1)/2));
        obj.reverse();
        
        return firstPart.equals(obj.toString());        
                                            
    }
}
