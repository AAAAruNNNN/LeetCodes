package LinkedList;
import LinkedLists.SinglyLinkedList;
public class AddTwoNumbers {
	
	public static void main(String args[]) {
		AddTwoNumbers obj = new AddTwoNumbers();
		SinglyLinkedList l1 = new SinglyLinkedList().generateList(1, 3);
		SinglyLinkedList l2 = new SinglyLinkedList().generateList(4, 7);
		new SinglyLinkedList().printSinglyLinkedList(l1);
		System.out.println();
		new SinglyLinkedList().printSinglyLinkedList(l2);
		System.out.println();
		new SinglyLinkedList().printSinglyLinkedList(obj.addTwoNumbers(l1, l2));
	}
	
    public SinglyLinkedList addTwoNumbers(SinglyLinkedList l1, SinglyLinkedList l2) {
    	SinglyLinkedList node = new SinglyLinkedList();
    	SinglyLinkedList dummy = node;
        int carry = 0;
        while(l1!=null && l2!=null){
            node.next = new SinglyLinkedList();
            node = node.next;
            node.val = l1.val + l2.val + carry;
            carry = 0;
            if(node.val > 9){
                int temp = node.val % 10;
                carry = node.val / 10;
                node.val = temp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            node.next = new SinglyLinkedList();
            node = node.next;
            node.val = l1.val + carry;
            carry = 0;
            if(node.val > 9){
                int temp = node.val % 10;
                carry = node.val / 10;
                node.val = temp;
            }
            l1 = l1.next;
        }
        
        while(l2!=null){
            node.next = new SinglyLinkedList();
            node = node.next;
            node.val = l2.val + carry;
            carry = 0;
            if(node.val > 9){
                int temp = node.val % 10;
                carry = node.val / 10;
                node.val = temp;
            }
            l2 = l2.next;
        }
        if(carry != 0)
            node.next = new SinglyLinkedList(carry);
        return dummy.next;
    }
}
