package LinkedLists;

public class SinglyLinkedList {
	int val;
	SinglyLinkedList next;

	SinglyLinkedList() {}

	SinglyLinkedList(int val) {
		this.val = val;
	}

	SinglyLinkedList(int val, SinglyLinkedList next) {
		this.val = val;
		this.next = next;
	}

}
