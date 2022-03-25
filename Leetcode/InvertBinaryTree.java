//Time Complexity: O()
//Space Complexity: O(n)
//226. Invert Binary Tree
//https://leetcode.com/problems/invert-binary-tree/submissions/

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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode res=root.right;
        root.right=invertTree(root.left);
        root.left=invertTree(res);
        return root;
            
    }
}

// public class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         if(root == null) return null;
//         TreeNode tmp = root.left;
//         root.left = invertTree(root.right);
//         root.right = invertTree(tmp);
//         return root;
//     }
