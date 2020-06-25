package Trees;

public class MaximumDepthOfBinaryTree {

	public static void main(String args[]) {
		MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();
		TreeNode root = new TreeNode(3,new TreeNode(9,null,null), 
				new TreeNode(20, new TreeNode(15, null,null), new TreeNode(7,null,null)));
		  //   3
		  //  / \
		  // 9  20
		  //   /  \
		  //  15   7
		System.out.println(obj.maxDepth(root));
	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int l = maxDepth(root.left) + 1;
		int r = maxDepth(root.right) + 1;
		return l >= r ? l : r;
	}
}
