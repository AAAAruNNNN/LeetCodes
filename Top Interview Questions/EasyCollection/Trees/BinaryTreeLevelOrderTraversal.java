package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
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
		System.out.println(Arrays.toString((obj.levelOrder(root).toArray())));
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> rowList = new ArrayList<Integer>();
        if(root == null)
            return list;
        Queue<TreeNode> qone = new LinkedList<TreeNode>(), qtwo = new LinkedList<TreeNode>();
        qone.add(root);
        while(!qone.isEmpty()){
            TreeNode node = qone.remove();
            rowList.add(node.val);
            if(node.left !=null) qtwo.add(node.left);
            if(node.right != null) qtwo.add(node.right);
            if(qone.isEmpty()){
                list.add(rowList);
                rowList = new ArrayList<Integer>();
                qone = qtwo;
                qtwo = new LinkedList<TreeNode>();
            }
            
        }
        return list;
    }
}
