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
    TreeNode first = null, second = null, prev = null;
    public void recoverTree(TreeNode root) {
		// First we will traverse inoder and store it in arrayList
		// then we will traverse the arrayList and find the first and second
		//this approach solves in O(N2)
		ArrayList<TreeNode> in = new ArrayList<>();
		inorder(root, in);
		// 		for (int i = 0 ; i<in.size() - 1 ; i++) {
		// 			if (in.get(i).data > in.get(i + 1).data) {
		// 				if (first == null)
		// 					first = in.get(i);
		// 				// here first will be modified only
		// 				// once because after seeing 1st voilation we just need to
		// 				// fina second violation
		// 				second = in.get(i + 1);
		// 			}
		// 		}
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
		
	}
	public void inorder(TreeNode root, ArrayList<TreeNode> in) {
		if (root == null)
			return;
		
		inorder(root.left, in);
		// 		in.add(root); //this takes O(n2)
		//for solving it in O(N) we will use prev , first and second pointer Node
		if (prev != null) {
			if (prev.val > root.val) {
				if (first == null)
					first = prev;
				second = root;
			}
			
		}
		prev = root;
		inorder(root.right, in);
	}
}