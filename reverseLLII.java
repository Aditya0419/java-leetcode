public class reverseLLII {
    public static ListNode reverselinkedlist(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr=prev;
        while(curr!=null){
            System.out.print(curr.val);
            curr=curr.next;
        }
        return prev;
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right) return head;

        ListNode curr=head;
        ListNode lft=null;
        ListNode rightNxt=null;
        ListNode leftPrv=null;
        int count=1;
        while(rightNxt==null){
            if(count==left) lft=curr;
            if(count==left-1) leftPrv=curr;
            if(count==right){
                if(curr.next==null) break;
                rightNxt=curr.next;
                curr.next=null;
                break;
            }
            curr=curr.next;
            count++;
        }
        ListNode newH=reverselinkedlist(lft);
        lft.next=rightNxt;
        if(leftPrv!=null) leftPrv.next=newH;


        curr=left==1?newH:head;
        System.out.println();
        while(curr!=null){
            System.out.print(curr.val);
            curr=curr.next;
        }

        return left==1?newH:head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(5);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);

        reverseBetween(head, 1, 2);

    }
}
