import java.util.Comparator;
import java.util.PriorityQueue;

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

public class mergeKsortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || (lists.length==1 && lists[0]==null)) return null;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode node:lists){
            if(node==null) continue;
            ListNode curr=node;
            while(curr!=null){
                pq.add(curr);
                curr=curr.next;
            }
        }
        ListNode head=pq.poll();
        ListNode curr=head;
        while(!pq.isEmpty()){
            ListNode next=pq.poll();
            curr.next=next;
            curr=curr.next;
        }
        if(curr!=null) curr.next=null;
        return head;
    }
}
