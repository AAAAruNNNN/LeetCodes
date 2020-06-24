package LinkedLists;

import java.util.ArrayList;

public class PalindromeLinkedList {
	SinglyLinkedList left;

	public static void main(String args[]) {
		SinglyLinkedList head = new SinglyLinkedList(12);
		head.next = new SinglyLinkedList(132);
		PalindromeLinkedList obj = new PalindromeLinkedList();
		System.out.println(obj.isPalindromeCompleteRecursive(head));
	}

	public boolean isPalindrome(SinglyLinkedList head) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (head != null) {
			arr.add(head.val);
			head = head.next;
		}
		/*
		 * Integer has its int values boxed so if we compare two Integer directly it
		 * checks if both the values are refering to the same object rather than
		 * checking if both has same value. if int and Integer values are compared then
		 * Integer value automatically casts to unboxed primitive int. To check if two
		 * Integer (boxed) values use .equals() method or get the intValue() and compare
		 * them.
		 */
		for (int i = 0, j = arr.size() - 1; i < j; i++, j--) {
			if (arr.get(i).intValue() != arr.get(j).intValue())
				return false;
		}
		return true;
	}

	public boolean isPalindromePartialRecursive(SinglyLinkedList head) {
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

	public SinglyLinkedList reverseList(SinglyLinkedList head) {
		if (head == null || head.next == null)
			return head;
		SinglyLinkedList p = reverseList(head.next);
		SinglyLinkedList nextNode = head.next;
		head.next = null;
		nextNode.next = head;
		return p;
	}

	public boolean isPalindromeCompleteRecursive(SinglyLinkedList head) {

		left = head;
		return palindromeCheckRecursive(head);
	}

	public boolean palindromeCheckRecursive(SinglyLinkedList head) {
		if (head == null)
			return true;
		boolean check = palindromeCheckRecursive(head.next);
		if (check == false)
			return false;
		if (left.val == head.val) {
			left = left.next;
			return true;
		} else
			check = false;
		return check;

	}

}
