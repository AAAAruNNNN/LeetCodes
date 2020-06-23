package LinkedLists;

import java.util.ArrayList;

public class DeleteNodeInALinkedList {

	
	public static void main(String args[]) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(5);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(9);
		deleteNode(head.next.next);
		printLinkedList(head);
	}
	
	public static void printLinkedList(ListNode head) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(head.val);
		while(head.next != null) {
			list.add(head.next.val);
			head = head.next;
		}
		System.out.println(list.toString());
	}
	
    public static void deleteNode(ListNode node) {
        //4->5->1->9->null
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val = val;
	}
}