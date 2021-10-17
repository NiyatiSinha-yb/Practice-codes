//https://leetcode.com/problems/minimum-absolute-difference-in-bst/submissions/
//530. Minimum Absolute Difference in BST
//Time complexity: O(N)
//Space Complexity: O(N)

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
    ArrayList<Integer> ls=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
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
