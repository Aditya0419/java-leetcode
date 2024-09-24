public class reverseNodesInkGroups {
    public ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        System.out.println("reverse");
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
        System.out.println();
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        ListNode newH;
        int count = 0;
        while (curr != null) {

            count = 1;
            newH = curr;
            
            while (curr != null && count < k) {
                if (curr.next == null)
                    break;
                curr = curr.next;
                next = curr.next;
                count++;
            }
            if (count == k) {
                System.out.println(curr.val);
                curr.next = null;
                ListNode rev = reverseLL(newH);
                
                if (prev == null)
                    head = rev;
                else
                    prev.next = rev;
                while (rev.next != null) {
                    rev = rev.next;
                    prev = rev;
                }
                System.out.println(prev.val+" "+rev.val+" x"+next.val+" "+head.val+" "+head.next.val);
                rev.next = next;
                
            }
            else if(count<k && curr. next==null) break;
            curr = next;
        }

        return head;
    }

    public static void printLL(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        System.out.print(cur.val + "->");
        System.out.print(-1);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // head.next.next.next.next.next = new ListNode(6);
        reverseNodesInkGroups ob = new reverseNodesInkGroups();
        head = ob.reverseKGroup(head, 3);
        printLL(head);
    }
}
