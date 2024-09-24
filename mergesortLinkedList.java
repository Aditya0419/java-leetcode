public class mergesortLinkedList {
    public ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = findMid(head);
        ListNode newH = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(newH);
        
        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode mergeLL = new ListNode(-1);
        ListNode temp = mergeLL;
        while (left != null && right != null) {
            if (left.val < right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if (left != null) temp.next = left;
        if (right != null) temp.next = right;

        return mergeLL.next;
    }

    public static void main(String[] args) {

    }
}
