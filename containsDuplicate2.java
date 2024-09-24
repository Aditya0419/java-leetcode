import java.util.HashMap;

public class containsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], i);

            } else {
                if (i - hm.get(nums[i]) <= k) {
                    return true;
                } else {
                    hm.put(nums[i], i);
                }

            }

        }
        return false;
    }
}
