//617. Merge Two Binary Trees
//https://leetcode.com/problems/merge-two-binary-trees/
//Time Complexity: O(n+m)
//Space Complexity: O(n+m)

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
    TreeNode res=new TreeNode();
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) 
    {
        //TreeNode res=new TreeNode();
        //res.val=root1.val+root2.val;
        if(root1==null && root2==null)
            return null;
        traverse(root1, root2, res);
        return res;
    }
    /*
    public void inOrder(TreeNode root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
  */
    public void traverse(TreeNode root1, TreeNode root2, TreeNode ress)
    {
        try{
           
            if(root1!=null && root2!=null){
                ress.val=root1.val+root2.val;

                if(root1.left!=null || root2.left!=null){
                    ress.left=new TreeNode();
                    traverse(root1.left,root2.left,ress.left);
                }
                if(root1.right!=null || root2.right!=null)
                {
                    ress.right=new TreeNode();
                    traverse(root1.right,root2.right,ress.right);
                }    
        }
        else if(root1==null){
            ress.val=root2.val;
            if(root2.left!=null)
            {
                ress.left=new TreeNode();
                traverse(null,root2.left,ress.left);
            }
            if(root2.right!=null)
            {
                ress.right=new TreeNode();
                traverse(null,root2.right,ress.right);
            }
        }
        else{
            ress.val=root1.val;
            //System.out.println("Hello World"+root1.val);
            if(root1.left!=null)
            {
                ress.left=new TreeNode();
                traverse(root1.left,null,ress.left);
            }
            if(root1.right!=null)
            {
                ress.right=new TreeNode();
                traverse(root1.right,null,ress.right);
            }
            
        }
        // System.out.println(res);
            // inOrder(res);
           // System.out.println();
        
        //System.out.println(root1.left+" , "+root2.left);
        
        }
        catch(Exception e)
        {
            System.out.println("***"+e.getMessage());
        }
        
    }
    
}
