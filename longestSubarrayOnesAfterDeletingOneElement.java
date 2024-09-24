public class longestSubarrayOnesAfterDeletingOneElement {
    public static int longestSubarray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        boolean oneZero = false;
        int si = 0, ei = 0;
        while (ei < nums.length && si < nums.length) {
            if (nums[ei] == 0 && !oneZero) {
                oneZero = true;
            } else if (nums[ei] == 0 && oneZero) {
                while (nums[si] != 0 && si <= ei) {
                    si++;
                }
                si++;
            }
            max = Math.max(max, ei - si);
            ei++;
        }

        return max == Integer.MIN_VALUE ? 0 : max;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1 };
        System.out.println(longestSubarray(nums));
    }
}
