package TreesAndGraphs;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
	class Node{
		int val;
		Node left;
		Node right;
		Node next;
	}
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        Queue<Node> inner = new LinkedList<Node>();
        if(root == null)
            return null;
        q.add(root);
        while(!q.isEmpty()){
            Node node = q.remove();
            if(node.left!=null) inner.add(node.left);
            if(node.right!=null) inner.add(node.right);
            
            if(q.isEmpty()){
                node.next = null;
                q = inner;
                inner = new LinkedList<Node>();
            }
            else{
                node.next = q.peek();
            }
        }
        return root;
    }
}
