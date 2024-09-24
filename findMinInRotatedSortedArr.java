public class findMinInRotatedSortedArr {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int pivot = 0;
        while (left < right) {
            pivot = (left + right) / 2;
            if (nums[pivot] > nums[right]) {
                left = pivot + 1;
            } else if (nums[pivot] < nums[right]) {
                right = pivot;
            }
        }
        return nums[pivot];
    }
}
