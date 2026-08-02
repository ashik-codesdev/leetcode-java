

package Easy;

public class P0206_ReverseLinkedList {

    
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next; 
            curr.next = prev;              
            prev = curr;                   
            curr = nextTemp;              
        }

        return prev;
    }

    
    public static void printList(ListNode head) {
        ListNode curr = head;
        StringBuilder sb = new StringBuilder();
        while (curr != null) {
            sb.append(curr.val).append(curr.next != null ? " -> " : "");
            curr = curr.next;
        }
        System.out.println(sb.toString());
    }

    
    public static void main(String[] args) {
        P0206_ReverseLinkedList solution = new P0206_ReverseLinkedList();

       
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.print("Original List: ");
        printList(head);

        ListNode reversed = solution.reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversed);
    }
}
