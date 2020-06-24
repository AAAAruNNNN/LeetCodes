package LinkedLists;

public class MergeTwoSortedLists {
	
	public static void main(String args[]) {
		MergeTwoSortedLists obj = new MergeTwoSortedLists();
		SinglyLinkedList l1 = new SinglyLinkedList().generateList(1, 3);
		SinglyLinkedList l2 = new SinglyLinkedList().generateList(4, 6);
		new SinglyLinkedList().printSinglyLinkedList(obj.mergeTwoLists(l1, l2));
	}
	
    public SinglyLinkedList mergeTwoLists(SinglyLinkedList l1, SinglyLinkedList l2) {
        SinglyLinkedList dummy = new SinglyLinkedList(0,l1);
        SinglyLinkedList n = dummy;
        SinglyLinkedList m = l2;
        while(n.next!=null && m!=null){
            if(n.next.val > m.val){
                SinglyLinkedList temp = m;
                m = m.next;
                temp.next = n.next;
                n.next = temp;
            }
            n = n.next;
        }
        if(m!=null){
            n.next = m;
            n = n.next;
            m = m.next;
        }
        return dummy.next;
    }
}
