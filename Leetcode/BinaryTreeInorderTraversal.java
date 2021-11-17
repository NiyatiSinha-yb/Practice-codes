//94. Binary Tree Inorder Traversal
//https://leetcode.com/problems/binary-tree-inorder-traversal/
//Time Complexity: O(n)
//Space Complexity: O(1)  //List is not counted for space complexity

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> inorder= new ArrayList<>();
        inorderTraverse(root, inorder);
        return inorder;
        
    }
    public void inorderTraverse(TreeNode root, List inorder)
    {
        if(root==null)
            return;
            
            inorderTraverse(root.left,inorder);
            inorder.add(root.val);
            inorderTraverse(root.right,inorder);
    }
}
