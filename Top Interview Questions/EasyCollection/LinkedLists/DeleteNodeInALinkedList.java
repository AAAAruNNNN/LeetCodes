package LinkedLists;

import java.util.ArrayList;
import LinkedLists.SinglyLinkedList;

public class DeleteNodeInALinkedList {

	
	public static void main(String args[]) {
		SinglyLinkedList head = new SinglyLinkedList(4);
		head.next = new SinglyLinkedList(5);
		head.next.next = new SinglyLinkedList(1);
		head.next.next.next = new SinglyLinkedList(9);
		deleteNode(head.next.next);
		printLinkedList(head);
	}
	
	public static void printLinkedList(SinglyLinkedList head) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(head.val);
		while(head.next != null) {
			list.add(head.next.val);
			head = head.next;
		}
		System.out.println(list.toString());
	}
	
    public static void deleteNode(SinglyLinkedList node) {
        //4->5->1->9->null
        node.val = node.next.val;
        node.next = node.next.next;
    }

}