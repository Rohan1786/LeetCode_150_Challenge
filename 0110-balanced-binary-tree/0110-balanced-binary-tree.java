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
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=getHeight(root.left);
        int r = getHeight(root.right);
        return Math.max(l, r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
}