//Time complexity : O(m)
//Space complexity : O(m)
  //https://leetcode.com/problems/merge-two-binary-trees/submissions/
//617. Merge Two Binary Trees

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
 
    
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) 
    {
        try{
               // printPreorder(ress);
                 if(root1==null)
                     return root2;
                 else if(root2==null)
                    return root1;
                 
                 root1.val=root1.val+root2.val;
                     
                 root1.left = mergeTrees(root1.left,root2.left);
                     
                 root1.right = mergeTrees(root1.right,root2.right);
                     
                 
        }
        
        catch(Exception e)
        {
            System.out.println("**Exception** "+ e.getMessage());
        }
        return root1;
        
        
        
    }
    
}
