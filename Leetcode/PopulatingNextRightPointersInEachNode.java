//time Complexity: O(N)
//Space complexity: O(N) -> for the stack formating due to recursive calls.
//116. Populating Next Right Pointers in Each Node
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

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
        if(i==0)
        {
            node.next=null;
            i=-1;
        }
        if(node.left!=null)
            node.left.next=node.right;
        if(node.right!=null && node.next!=null)
            node.right.next=node.next.left;
        if(node.right!=null && node.next==null)
            node.right.next=null;;
        
        connect(node.left);
        connect(node.right);
        return node;    
    }
}
