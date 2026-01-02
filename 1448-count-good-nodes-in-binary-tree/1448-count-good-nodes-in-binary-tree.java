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
    public int solve(TreeNode root, int maxSoFar){
        if(root==null){
            return 0;
        }
        int cnt =0;
        if(root.val>=maxSoFar){
            cnt =1;
            maxSoFar=root.val;
        }
        cnt+=solve(root.left, maxSoFar);
        cnt+=solve(root.right, maxSoFar);
        return cnt;
    }
    
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
     return solve(root, Integer.MIN_VALUE);
    }
}