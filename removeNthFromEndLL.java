public class removeNthFromEndLL {
    public static ListNode reverselinkedlist(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr = prev;
        while (curr != null) {
            System.out.print(curr.val);
            curr = curr.next;
        }
        return prev;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode newH = reverselinkedlist(head);
        ListNode curr = newH;
        int count = 1;
        boolean removed = false;
        while (curr != null) {
            System.out.println(count + " " + removed);
            if (count == n - 1 && !removed) {
                System.out.println("hi");
                curr.next = curr.next.next;
                removed = true;
                break;
            } else if (count == n && !removed) {
                System.out.println("hi2");
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
                newH = curr;
                break;
            }
            curr = curr.next;
            count++;

        }
        return reverselinkedlist(newH);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        removeNthFromEnd(head, 5);
    }
}
