public class mergeSortedLLs {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1=list1;
        ListNode curr2=list2;
        ListNode newH=new ListNode(-1);
        ListNode temp=newH;
        while(curr1!=null && curr2!=null){
            if(curr1.val<=curr2.val){
                temp.next=new ListNode(curr1.val);
                curr1=curr1.next;
                temp=temp.next;
            }else{
                temp.next=new ListNode(curr2.val);
                curr2=curr2.next;
                temp=temp.next;
            }
        }
        while(curr1!=null){
            temp.next=new ListNode(curr1.val);
            curr1=curr1.next;
            temp=temp.next;
        }
        while(curr2!=null){
            temp.next=new ListNode(curr2.val);
            curr2=curr2.next;
            temp=temp.next;
        }

        return newH.next;
    }
    public static void main(String[] args) {
        mergeSortedLLs obj=new mergeSortedLLs();
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        ListNode ans=obj.mergeTwoLists(l1,l2);
        while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }
    }
}
