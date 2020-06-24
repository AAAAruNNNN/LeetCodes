package LinkedLists;
import java.util.ArrayList;

public class PalindromeLinkedList {
	
	public static void main(String args[]) {
		SinglyLinkedList head = new SinglyLinkedList(132);
		head.next = new SinglyLinkedList(132);
		System.out.println(isPalindrome(head));
	}
	
    public static boolean isPalindrome(SinglyLinkedList head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        for(int i = 0, j = arr.size()-1; i<j;i++,j--){
            int x = arr.get(i);
            int y = arr.get(j);
            if(x != y)
                return false;
        }
        return true;
    }
//    public boolean isPalindrome(SinglyLinkedList head) {
//        if(head == null || head.next == null)
//            return true;
//        if(head.next.next == null){
//            if(head.val == head.next.val)
//                return true;
//            return false;
//        }
//        Stack<Integer> st = new Stack<Integer>();
//        SinglyLinkedList slow = head;
//        SinglyLinkedList fast = head;
//        while(fast != null && fast.next!= null){
//            st.push(slow.val);
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        if(fast != null)
//            slow = slow.next;
//     
//        
//        
//        while(slow!= null && !st.isEmpty()){
//            
//            if(slow.val == st.pop().intValue())
//                slow = slow.next;
//            else 
//                return false;
//        }
//        return true;
//    }
}
