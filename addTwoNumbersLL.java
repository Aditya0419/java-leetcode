class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class addTwoNumbersLL {

    public static void printLL(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        System.out.print(cur.val + "->");
        System.out.print(-1);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int sum = 0, carry = 0;

        while (cur1 != null && cur2 != null) {
            sum = cur1.val + cur2.val + carry;

            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }

            if (cur == head) {
                cur.val = sum;
            } else {
                cur.next = new ListNode(sum);
                cur = cur.next;
            }

            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        while (cur1.next != null) {
            sum = cur1.val + carry;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }

            if (cur == head) {
                cur.val = sum;
            } else {
                cur.next = new ListNode(sum);
                cur = cur.next;
            }

            cur1=cur1.next;
        }

        while (cur2.next != null) {
            sum = cur2.val + carry;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }

            if (cur == head) {
                cur.val = sum;
            } else {
                cur.next = new ListNode(sum);
                cur = cur.next;
            }

            cur2=cur2.next;
        }

        if(carry==1){
            cur.next = new ListNode(1);

        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        
    }
}
