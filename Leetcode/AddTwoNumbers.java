//Time Complexity: O(maximum length of linkedlist among the two to add+1)
//Space Complexity: O(maximum length of linkedlist among the two to add+1)
//https://leetcode.com/problems/add-two-numbers/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode head=l3;
        int sum,carry=0;
        int flag=0;
        while(l1!=null && l2!=null)
        {
            if(flag!=0)
            {
                l3.next=new ListNode();
                l3=l3.next;
            }
            flag=1;
            //System.out.println(l1.val+", "+l2.val);
            sum=l1.val+l2.val+carry;
            // System.out.println("sum="+sum);
            // System.out.println();
            if(sum>9)
            {
                carry=sum/10;
                sum=sum%10;   
            }
            else
                carry=0;
            l3.val=sum;
           
            //l3=l3.next;
            l1=l1.next;
            l2=l2.next;
        }
        //System.out.println("end of while loop");
       
        flag=0;
        while(l1!=null)
        {
           // System.out.println("if");
           // if(flag!=0)
                
            //flag=1;
            l3.next=new ListNode();
            l3=l3.next;
            //System.out.println(l1.val+" , "+carry);
            sum=l1.val+carry;
           // System.out.println("sum="+sum);
            // System.out.println();
            if(sum>9)
            {
                carry=sum/10;
                sum=sum%10;  
               // System.out.println("sum, carry"+sum+" , "+carry);
            }
            else
                carry=0;
           // System.out.println("sum, carry"+sum+" , "+carry);
             l3.val=sum;
            l1=l1.next;
             
        }
        while(l2!=null)
        {
           // System.out.println("else");
            l3.next=new ListNode();
            l3=l3.next;       
            //System.out.println(l2.val+" , "+carry);
            sum=l2.val+carry;
            //System.out.println("sum="+sum);
             //System.out.println();
            if(sum>9)
            {
                carry=sum/10;
                sum=sum%10;   
            }
            else
                carry=0;
            l3.val=sum;
             l2=l2.next;
        }
         if(carry!=0 && l1==null && l2==null)
        {
            l3.next=new ListNode();
            l3=l3.next;
            l3.val=carry;
        }
        
        return head;
    }
}
