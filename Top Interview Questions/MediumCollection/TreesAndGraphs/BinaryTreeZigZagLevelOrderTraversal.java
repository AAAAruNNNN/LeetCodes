package TreesAndGraphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import Trees.TreeNode;

public class BinaryTreeZigZagLevelOrderTraversal {

	public static void main(String args[]) {
		BinaryTreeZigZagLevelOrderTraversal obj = new BinaryTreeZigZagLevelOrderTraversal();
		TreeNode root = new TreeNode(3,new TreeNode(9,null,null), 
				new TreeNode(20, new TreeNode(15, new TreeNode(16, null,null),new TreeNode(17, null,null)), new TreeNode(7,new TreeNode(19, null,null),new TreeNode(20, null,null))));
		  //   3
		  //  / \
		  // 9   20
		  //   /   \
		  //  15    7
		  //  / \  / \
		  // 16 17 19 20
		System.out.println(Arrays.toString(obj.zigzagLevelOrder(root).toArray()));
	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(root == null)
			return list;
		boolean invert = true;
		Stack<TreeNode> innerStack = new Stack<TreeNode>();
		Stack<TreeNode> outerStack = new Stack<TreeNode>();
		List<Integer> innerList = new ArrayList<Integer>();
		outerStack.add(root);
		while(!outerStack.isEmpty()) {
			TreeNode node = outerStack.pop();
			innerList.add(node.val);
			if(invert) {
				if(node.left != null) innerStack.add(node.left);
				if(node.right != null) innerStack.add(node.right);
			}
			else {
				if(node.right != null) innerStack.add(node.right);
				if(node.left != null) innerStack.add(node.left);
			}
			
			if(outerStack.isEmpty()) {
				list.add(innerList);
				innerList = new ArrayList<Integer>();
				outerStack = innerStack;
				innerStack = new Stack<TreeNode>();
				invert = invert == true?false:true;
			}
		}
		
		
		return list;
	}
	
}
