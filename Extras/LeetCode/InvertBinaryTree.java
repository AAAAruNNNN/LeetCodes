package LeetCode;

public class InvertBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public TreeNode invertTree(TreeNode root) {
		if (root != null) {
			TreeNode temp = root.left;
			root.left = root.right;
			invertTree(root.left);
			root.right = temp;
			invertTree(root.right);
		}
		return root;
		/*
		     4
		   /   \
		  2     7
		 / \   / \
		1   3 6   9 
		
		*/       
	}
}
