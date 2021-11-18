//Time Complexity: O(n)
//Space Complexity: O(n) -> for recursive blocks
//938. Range Sum of BST
//https://leetcode.com/problems/range-sum-of-bst/submissions/

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
    int sum=0;
     public void calculateSum(TreeNode root, int low, int high) 
     {
         if(root==null)
             return;
         if(root.val<=high && root.val>=low)
             sum+=root.val;
         calculateSum(root.left, low, high);
         calculateSum(root.right, low, high);
     }
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        calculateSum(root,low,high);
        return sum;
        
    }
}
