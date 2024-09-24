public class searchRotatedSortedArr {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pivot = 0;
        while (left <= right) {
            pivot = (left + right) / 2;
            if (nums[pivot] == target)
                return pivot;
            if (nums[pivot] > nums[right])
                left = pivot + 1;
            else if(pivot>0 && pivot<nums.length-1 && nums[pivot]<nums[pivot-1] && nums[pivot]<nums[pivot+1])
                break;
            else
                right = pivot - 1;
        }
        left = 0;
        right = nums.length - 1;
        int mid = 0;
        if (pivot == 0) {
            while (left <= right) {
                mid = (left + right) / 2;
                if (nums[mid] == target)
                    return mid;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else
                    left = mid + 1;
            }
        } else {
            if (target >= nums[0] && target <= nums[pivot - 1]) {
                right = pivot - 1;
                while (left <= right) {
                    mid = (left + right) / 2;
                    if (nums[mid] == target)
                        return mid;
                    if (nums[mid] > target) {
                        right = mid - 1;
                    } else
                        left = mid + 1;
                }
            } else {
                left = pivot;
                while (left <= right) {
                    mid = (left + right) / 2;
                    if (nums[mid] == target)
                        return mid;
                    if (nums[mid] > target) {
                        right = mid - 1;
                    } else
                        left = mid + 1;
                }
            }
        }

        return -1;
    }
}
