import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class longestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int res = 0;
        
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            if(ht.contains(nums[i])) continue;
            else ht.put(i, nums[i]);
        }


        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int count = 1;
            System.out.println(curr);
            if (!ht.contains(curr - 1)) {
                while (ht.containsValue(curr + 1)) {
                    System.out.println(curr + " " + count);
                    curr = curr + 1;
                    count++;
                }
            }

            res = Math.max(count, res);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(arr));
    }
}
