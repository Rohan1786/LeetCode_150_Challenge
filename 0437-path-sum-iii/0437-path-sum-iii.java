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
    public int helper(TreeNode root, long targetSum){
        if(root==null) return 0;
        int cnt=0;
        if((long)root.val==(long)(targetSum)){
       cnt++;
        }
        return cnt+helper(root.left,targetSum-root.val)+helper(root.right,targetSum-root.val);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int count = helper(root,(long)targetSum);
        return count+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
}