public class maxSubarraySumCircularArr {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int minSum=Integer.MAX_VALUE;
        int tot=0;
        for (int i = 0; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
            tot+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            currSum = Math.min(nums[i], currSum + nums[i]);
            minSum = Math.min(minSum, currSum);
        }
        return Math.max(maxSum,tot-minSum);
    }
}
