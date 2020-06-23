package LinkedLists;
import LinkedLists.SinglyLinkedList;

public class RemoveNthNodeFromEnd {
    public static SinglyLinkedList removeNthFromEnd(SinglyLinkedList head, int n) {
        // // 1->2->3->4->5, and n = 2.
        // //1->2->3->5
        /*
         *
         *Dummy node is required to handle the edge cases where 
         *we have to delete the head node like ex: [1,2] & n = 1 or [1] & n = 1
         *
         */
    	SinglyLinkedList dummy = new SinglyLinkedList(0,head);
    	SinglyLinkedList curr = dummy,ahead = head;                     
        for(int i = 0; i < n; i++){
            ahead = ahead.next;
        }
        while(ahead != null){
            curr = curr.next;
            ahead = ahead.next;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }
    
    public static void main(String args[]) {
    	SinglyLinkedList head = new SinglyLinkedList().generateList(1, 5);
    	head.printSinglyLinkedList(removeNthFromEnd(head,2));
    }
}
