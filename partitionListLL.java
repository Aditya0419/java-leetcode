public class partitionListLL {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode nh = new ListNode();
        ListNode l = nh;
        ListNode g = nh;
        ListNode curr = head;
        boolean hinsert = false;
        while (curr != null) {
            if (!hinsert && l == nh && g == nh) {
                nh.val = curr.val;
                hinsert = true;
            } else if (curr.val < x) {
                ListNode temp = new ListNode(curr.val);
                if (l.next != null) {
                    temp.next = l.next;
                    l.next = temp;
                    l = temp;
                } else {
                    if (l == nh && l.val > x) {
                        l = temp;
                        l.next = g;
                        nh = l;
                    } else {
                        l.next = temp;
                        l = temp;
                        g = l;
                    }

                }
            } else {
                ListNode temp = new ListNode(curr.val);
                g.next = temp;
                g = temp;
            }

            curr = curr.next;
        }
        return nh;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        System.out.println(head.val);
    }
}
