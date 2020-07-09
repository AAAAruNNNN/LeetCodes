package TreesAndGraphs;

import java.util.Stack;

import Trees.TreeNode;

public class KthSmallestInABST {
	public static void main(String args[]) {
		KthSmallestInABST obj = new KthSmallestInABST();
		TreeNode root = new TreeNode(3,new TreeNode(1,null,new TreeNode(2,null,null)), 
				new TreeNode(4,null,null));
		//		   3
		//		   / \
		//		  1   4
		//		   \
		//		    2
		System.out.println(obj.kthSmallest(root, 3));
	}
	
	public int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root == null)
			return -1;
		while(true) {
			if(root != null) {
				stack.add(root);
				root = root.left;
			}
			else {
				TreeNode node = stack.pop();
				if(--k == 0) return node.val;
				root = node.right;
			}
		}
	}
}
