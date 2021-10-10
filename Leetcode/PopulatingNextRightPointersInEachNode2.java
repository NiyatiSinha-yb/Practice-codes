//PopulatingNextRightPointersInEachNode2.java
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
//116. Populating Next Right Pointers in Each Node
//Time Complexity: O(n)
//Space Complexity: O(n) due to the recursive calls.

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    static int i=0;
    public Node connect(Node node) {
        if(node==null)
        {
            return null;
        }
        /*if(i==0)
        {
            node.next=null;
            i=-1;
        }*/
        //Setting the next as null for the rightmost node of every/any level is not required because if we don't specify the next for those then it will be automatically treated as null.
        
        if(node.left!=null)
            node.left.next=node.right;
        if(node.right!=null && node.next!=null)
            node.right.next=node.next.left;
        /*if(node.right!=null && node.next==null)
            node.right.next=null;;
        */
        //Setting the next as null for the rightmost node of every/any level is not required because if we don't specify the next for those then it will be automatically treated as null.
        connect(node.left);
        connect(node.right);
        return node;    
    }
}
