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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return mirror(root.left, root.right)&& mirror(root.right, root.left);
    }
    public boolean mirror(TreeNode leftRoot, TreeNode rightRoot){
        if(leftRoot==null && rightRoot==null) return true;
        if(leftRoot==null||rightRoot==null) return false;
        if(leftRoot.val!=rightRoot.val) return false;
        return mirror(leftRoot.left, rightRoot.right)&& mirror(leftRoot.right, rightRoot.left);
    }
}