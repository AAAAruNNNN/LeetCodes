package LinkedLists;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        if(head.next.next == null){
            if(head.val == head.next.val)
                return true;
            return false;
        }
        Stack<Integer> st = new Stack<Integer>();
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!= null){
            st.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
            slow = slow.next;
     
        
        
        while(slow!= null && !st.isEmpty()){
            
            if(slow.val == st.pop().intValue())
                slow = slow.next;
            else 
                return false;
        }
        return true;
    }
}
