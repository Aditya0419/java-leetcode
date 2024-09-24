import java.util.HashSet;

public class deleteNodeLLfromArr {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            if(hs.contains(temp.val)){
                if(prev==null){
                    head=temp.next;
                    temp=temp.next;
                }else{
                    prev.next=temp.next;
                    temp=temp.next;
                }
                
            }else{
                prev=temp;
                temp=temp.next;
            }
        }

        return head;

    }
}
