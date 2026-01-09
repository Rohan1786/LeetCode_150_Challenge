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

    public List<TreeNode> getDeepestNodes(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<TreeNode> level = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                level.add(curr);

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
        }
        return level;
    }

    public TreeNode lca(TreeNode root, TreeNode a, TreeNode b) {
        if (root == null || root == a || root == b) return root;

        TreeNode left = lca(root.left, a, b);
        TreeNode right = lca(root.right, a, b);

        if (left != null && right != null) return root;
        return left != null ? left : right;
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        List<TreeNode> deepest = getDeepestNodes(root);
        TreeNode ans = deepest.get(0);

        for (int i = 1; i < deepest.size(); i++) {
            ans = lca(root, ans, deepest.get(i));
        }
        return ans;
    }
}
