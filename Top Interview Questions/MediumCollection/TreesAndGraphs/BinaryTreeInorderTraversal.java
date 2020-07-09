package TreesAndGraphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import Trees.TreeNode;

public class BinaryTreeInorderTraversal {
	List<Integer> list = new ArrayList<Integer>();

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
		BinaryTreeInorderTraversal obj = new BinaryTreeInorderTraversal();
		System.out.println(Arrays.toString(obj.inorderTraversal(root).toArray()));
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (root != null || !stack.isEmpty()) {
			if (root != null) {
				stack.add(root);
				root = root.left;
			} else {
				root = stack.pop();
				list.add(root.val);
				root = root.right;
			}
		}
		// inorderTraversal(root.left);
		// list.add(root.val);
		// inorderTraversal(root.right);
		return list;
	}
}
