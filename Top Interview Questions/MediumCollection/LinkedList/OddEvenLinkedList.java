package LinkedList;
import LinkedLists.SinglyLinkedList;
public class OddEvenLinkedList {
	//Main Function
	public static void main(String args[]) {
		OddEvenLinkedList obj = new OddEvenLinkedList();
		SinglyLinkedList head = new SinglyLinkedList().generateList(1, 9);
		new SinglyLinkedList().printSinglyLinkedList(head);
		System.out.println();
		new SinglyLinkedList().printSinglyLinkedList(obj.oddEvenList(head));
	}
	
    public SinglyLinkedList oddEvenList(SinglyLinkedList head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        SinglyLinkedList curr = head;
        SinglyLinkedList temp = curr.next;
        SinglyLinkedList headTwo = temp;
        while(curr.next!=null && temp.next!=null){
            temp = curr.next;
            curr.next = temp.next;
            curr = curr.next;
            temp.next = curr.next;
            temp = temp.next;
        }
        curr.next = headTwo;
        return head;
    }
}
