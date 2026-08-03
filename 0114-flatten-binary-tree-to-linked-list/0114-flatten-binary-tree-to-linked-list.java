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
        if (root == null)
        return;

        Queue<TreeNode> q = new LinkedList<>();
        helper(root, q);
        TreeNode prev = q.poll();

        while (!q.isEmpty()) {
            TreeNode next = q.poll();

            prev.left = null;
            prev.right = next;

            prev = next;
        }
        prev.left = null;
        prev.right = null;
    }


    public void helper(TreeNode root, Queue<TreeNode> q) {
        if (root == null)
            return;
        q.offer(root);
        helper(root.left, q);
        helper(root.right, q);
        return;
    }
}