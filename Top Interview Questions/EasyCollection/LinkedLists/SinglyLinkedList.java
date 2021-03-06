package LinkedLists;

public class SinglyLinkedList {
	public int val;
	public SinglyLinkedList next;

	public SinglyLinkedList() {}

	public SinglyLinkedList(int val) {
		this.val = val;
	}

	public SinglyLinkedList(int val, SinglyLinkedList next) {
		this.val = val;
		this.next = next;
	}
	
	public SinglyLinkedList generateList(int start, int end){
    	SinglyLinkedList head = new SinglyLinkedList(start);
    	SinglyLinkedList node = head;
    	while(start<end) {
    		node.next = new SinglyLinkedList(++start);
    		node = node.next;
    	}
    	return head;
	}
	
	public void printSinglyLinkedList(SinglyLinkedList head) {
		while(head!=null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.print("null");
	}
	
	

}
