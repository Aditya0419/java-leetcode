import java.util.Comparator;
import java.util.PriorityQueue;

public class kthLargestArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        System.out.println(pq.toString());
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        System.out.println(pq.toString());
        return pq.peek();
    }
    public static void main(String[] args) {
        kthLargestArray obj=new kthLargestArray();
        int[] nums={3,2,1,5,6,4};
        int k=2;
        System.out.println(obj.findKthLargest(nums, k));
    }
}
