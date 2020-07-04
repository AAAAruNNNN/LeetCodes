package LinkedList;
import java.util.HashSet;
import java.util.Set;

import LinkedLists.SinglyLinkedList;
public class IntersectionOfTwoLists {
    public SinglyLinkedList getIntersectionNode(SinglyLinkedList headA, SinglyLinkedList headB) {
        Set<SinglyLinkedList> set = new HashSet<SinglyLinkedList>();
        while(headA!=null || headB!= null){
            if(headA!=null){
                if(set.contains(headA))
                    return headA;
                set.add(headA);
                headA = headA.next;
            }
            if(headB!=null){
                if(set.contains(headB)){
                    return headB;
                }
                set.add(headB);
                headB = headB.next;
            }
        }
        return null;
    }
}
