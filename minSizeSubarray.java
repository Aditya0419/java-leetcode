public class minSizeSubarray {
    public int minSubArrayLen(int target, int[] nums) {
        int si=0;
        int minSize=Integer.MAX_VALUE;
        int sum=0;

        for (int ei = 0; ei < nums.length; ei++) {
            sum+=nums[ei];

            while (sum>=target) {
                minSize=Math.min(minSize,ei-si+1);
                sum-=nums[si];
                si++;

            }

        }

        return minSize;
    }
    public static void main(String[] args) {
        
    }
}
