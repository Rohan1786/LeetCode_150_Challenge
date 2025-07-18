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
    public TreeNode helper(int[] preorder,int plow,int phigh,int[] inorder,int inlow,int inhigh){
        if(plow>phigh) return null;
       TreeNode root = new TreeNode(preorder[plow]);
       int i=0;
       while(inorder[i]!=preorder[plow]) i++;
       int leftSize=i-inlow;
       root.left = helper(preorder,plow+1,plow+leftSize,inorder,inlow,i-1);
       root.right = helper(preorder,plow+leftSize+1,phigh,inorder,i+1,inhigh);
       return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder,0,n-1,inorder,0,n-1);
    }
}