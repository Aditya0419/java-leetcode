public class removeDuplicatesLLII {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null && curr.next != null) {
            if (curr.val == curr.next.val) {

                while (curr.next!=null && curr.val == curr.next.val) {
                    System.out.println("b");
                    curr = curr.next;
                    // System.out.println(prev.val + " " + curr.next.val);
                }
                if (prev == null) {
                    head = curr.next;
                    curr=curr.next;
                } else {
                    System.out.println("else");
                    prev.next = curr.next;
                    curr=curr.next;
                }
            } else {
                System.out.println("outer else");
                prev = curr;
                curr = curr.next;
            }
            System.out.println("while end");
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        // head.next.next.next.next = new ListNode(4);
        // head.next.next.next.next.next = new ListNode(4);
        // head.next.next.next.next.next.next = new ListNode(5);

        deleteDuplicates(head);
    }
}
