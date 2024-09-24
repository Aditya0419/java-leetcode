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


public class rotateLL {
    public static ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next ;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // System.out.println(head.next.val+" absb");
        return prev;
    }

    public static  ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k == 0 || (head.next.next==null && k%2==0)) return head;
        if (head.next.next==null && k%2!=0 ) {
            ListNode temp = head.next;
            head.next = null;
            temp.next = head;
            return temp;
        }
        
        ListNode curr=head;
        ListNode tail=new ListNode();
        int count=0;
        while(curr!=null){
            tail=curr;
            count++;
            System.out.println(tail.val);
            curr=curr.next;
        }

        k=k%count;
        if(k==0) return head;

        head=reverseLL(head);
        curr=head;

        ListNode newHead=curr;
        ListNode newTail=curr;
        System.out.println(tail.next.val);
        for (int i = 1; i <= k; i++) {
            newTail=curr;
            curr=curr.next;
            newHead=curr;
            System.out.println("x "+newHead.val);
        }
        newTail.next=null;
        ListNode newH1=reverseLL(head);
        curr=newH1;
        newHead=reverseLL(newHead);
        for (int i = 1; i < k; i++) {
            curr=curr.next;
        }

        curr.next=newHead;

        printLL(newH1);
        return newH1;
    }

    public static void printLL(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
        System.out.print(cur.val+"->");
        System.out.print(-1);
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        // ListNode node2 = new ListNode(3);
        // ListNode node3 = new ListNode(4);
        // ListNode node4 = new ListNode(5);

        // LinkedListNode node6 = new LinkedListNode(5);
        head1.next = node1;
        // node1.next = node2;
        // node2.next = node3;
        // node3.next = node4;


        rotateRight(head1, 2);
    }
}
