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
    public void flatten(TreeNode root) {
        if (root == null) return;

        // Flatten left and right subtree
        flatten(root.left);
        flatten(root.right);

        // Store references
        TreeNode left = root.left;
        TreeNode right = root.right;

        // Set left to null and attach left to right
        root.left = null;
        root.right = left;

        // Go to the end of the new right (which was left)
        TreeNode temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }

        // Attach original right
        temp.right = right;
    }
}
