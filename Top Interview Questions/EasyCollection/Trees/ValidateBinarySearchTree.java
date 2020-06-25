package Trees;

import java.util.ArrayList;

public class ValidateBinarySearchTree {
    ArrayList<Integer> arr = new ArrayList<Integer>();

	public static void main(String args[]) {
		ValidateBinarySearchTree obj = new ValidateBinarySearchTree();
		TreeNode root = new TreeNode(5,new TreeNode(3,new TreeNode(2,null,null),new TreeNode(4,null,null)),
				new TreeNode(6,null,null));
		System.out.println(obj.isValidBST(root));
	}
	
    public boolean isValidBST(TreeNode root) {
        inOrderTrav(root);
        for(int i= 1;i<arr.size();i++){
            if(arr.get(i-1).intValue() >= arr.get(i).intValue())
                return false;
        }
        return true;
    }
    public void inOrderTrav(TreeNode root){
        if(root == null)
            return ;
        inOrderTrav(root.left);
        arr.add(root.val);
        inOrderTrav(root.right);
        return ;
        
    }
}
