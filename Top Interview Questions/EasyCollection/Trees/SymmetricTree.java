package Trees;

public class SymmetricTree {
	public static void main(String args[]) {
		SymmetricTree obj = new SymmetricTree();
//		TreeNode root = new TreeNode(3,new TreeNode(9,null,null), 
//				new TreeNode(20, new TreeNode(15, null,null), new TreeNode(7,null,null)));
		  //   3
		  //  / \
		  // 9  20
		  //   /  \
		  //  15   7
		TreeNode root = new TreeNode(3,new TreeNode(9,null,null), 
				new TreeNode(9, null,null));
		  //   3
		  //  / \
		  // 9   9
		System.out.println(obj.isSymmetric(root));
	}
	
	public boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		return isSymRec(root.left, root.right);
	}
	
	public boolean isSymRec(TreeNode left, TreeNode right) {
		if(left == null && right == null)
			return true;
		if(left == null && right != null || left !=null && right == null)
			return false;
		if(left.val != right.val) return false;
		else {
			boolean b1 = isSymRec(left.left,right.right);
			boolean b2 = isSymRec(left.right,right.left);
			if(b1 == false || b2 == false)
				return false;
		}
		return true;
	}
}
