//https://leetcode.com/problems/minimum-distance-between-bst-nodes/
//783. Minimum Distance Between BST Nodes
//Time Complexity: O(n)
//Spcae Complexity: O(n)

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

/*
class Solution {
    int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        
        traverse(root);
        return min;
    }
    void traverse(TreeNode node)
    {
       
        
        if(node.left!=null)
        {
            //System.out.println(node.val-node.left.val);
            if(node.val-node.left.val<min)
                min=node.val-node.left.val;
            traverse(node.left);
        }
        if(node.right!=null)
        {
            //System.out.println(node.right.val-node.val);
            if(node.right.val-node.val<min)
                min=node.right.val-node.val;
            traverse(node.right);
        }
        
    }
}*/




class Solution {
    ArrayList<Integer> ls=new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        ls.add(root.val);
        traverse(root);
        Collections.sort(ls);
        int min=Integer.MAX_VALUE;
        int prev=0;
        //ls.forEach((n) -> System.out.println(n));
        
        for(int i=0; i<ls.size();i++)
        {
            
            if(i==0)
            {
                prev=ls.get(i);
            }
            else{
            
                //System.out.println("**"+ls.get(i)+"-"+prev);
                if(min>ls.get(i)-prev)
                {
                    //System.out.println("*"+ls.get(i)+"-"+prev);
                    min=ls.get(i)-prev;
                }
                prev=ls.get(i);
            }
        }
        
        return min;
   
    }
    
    void traverse(TreeNode node)
    {
        
        if(node.left!=null)
        { 
            ls.add(node.left.val);
            traverse(node.left);
            
        }
        if(node.right!=null)
        {
            ls.add(node.right.val);
            traverse(node.right);
            
        }
    }
}
