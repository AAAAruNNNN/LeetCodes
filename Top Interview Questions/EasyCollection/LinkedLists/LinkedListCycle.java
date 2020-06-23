package LinkedLists;

public class LinkedListCycle {
    public boolean hasCycle(SinglyLinkedList head) {
        if(head == null || head.next == null)
            return false;
        SinglyLinkedList slow = head;
        SinglyLinkedList fast = head.next;
        
        while(slow != fast){
            if(fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    /*
        public boolean hasCycle(ListNode head) {
        ListNode h = head;
        ListNode t = head;
        t = setFastNode(t);
        while(t!=null){
            if(h == t)
                return true;
            h = h.next;
            t = setFastNode(t);
        }
        return false;
    }
    public ListNode setFastNode(ListNode t){
        for(int i = 0; i < 2; i++){
            if(t == null || t.next == null)
                return null;
            t = t.next;
        }
        return t;
    }
    */
}
