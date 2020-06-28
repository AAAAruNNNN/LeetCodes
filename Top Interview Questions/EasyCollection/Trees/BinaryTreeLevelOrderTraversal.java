package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	
	public static void main(String args[]) {
		BinaryTreeLevelOrderTraversal obj = new BinaryTreeLevelOrderTraversal();
		TreeNode root = new TreeNode(3,new TreeNode(9,null,null), 
				new TreeNode(20, new TreeNode(15, null,null), new TreeNode(7,null,null)));
		  //   3
		  //  / \
		  // 9  20
		  //   /  \
		  //  15   7
		obj.levelOrder(root);
	}
	
    public void levelOrder(TreeNode root) {
        //List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null) {
        	System.out.println("null");
            return ;        	
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            //List<Integer> rowList = new ArrayList<Integer>();
            TreeNode node = q.remove();
            System.out.print(node.val + " " );
            if(node.left !=null) q.add(node.left);
            if(node.right != null) q.add(node.right);
//            rowList.add(node.val);
            
        }
        return;
    }
}
