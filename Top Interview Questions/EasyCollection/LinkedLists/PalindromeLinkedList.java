package LinkedLists;

import java.util.ArrayList;

public class PalindromeLinkedList {

	public static void main(String args[]) {
		SinglyLinkedList head = new SinglyLinkedList(132);
		head.next = new SinglyLinkedList(132);
		System.out.println(isPalindromeRec(head));
	}

	public static boolean isPalindrome(SinglyLinkedList head) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (head != null) {
			arr.add(head.val);
			head = head.next;
		}
		for (int i = 0, j = arr.size() - 1; i < j; i++, j--) {
			int x = arr.get(i);
			int y = arr.get(j);
			if (x != y)
				return false;
		}
		return true;
	}

	public static boolean isPalindromeRec(SinglyLinkedList head) {
		SinglyLinkedList dummy = new SinglyLinkedList(0, head);
		SinglyLinkedList slow = dummy;
		SinglyLinkedList fast = dummy;
		SinglyLinkedList revHalfList;

		while (fast != null) {
			if (fast.next == null)
				break;
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast == null)
			revHalfList = reverseList(slow);
		else
			revHalfList = reverseList(slow.next);

		while (head != null && revHalfList != null) {
			if (head.val != revHalfList.val)
				return false;
			head = head.next;
			revHalfList = revHalfList.next;
		}
		return true;
	}

	

	public static SinglyLinkedList reverseList(SinglyLinkedList head) {
		if (head == null || head.next == null)
			return head;
		SinglyLinkedList p = reverseList(head.next);
		SinglyLinkedList nextNode = head.next;
		head.next = null;
		nextNode.next = head;
		return p;
	}

}
