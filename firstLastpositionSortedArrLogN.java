import java.util.Arrays;

public class firstLastpositionSortedArrLogN {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int fp = -1;
        int lp = -1;
        int[] res = { fp, lp };
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                fp = mid;
                lp = mid;
                while (fp > 0) {
                    if (nums[fp - 1] == target) {
                        fp = fp - 1;
                    } else {
                        break;
                    }
                }
                while (lp < nums.length - 1) {
                    if (nums[lp + 1] == target) {
                        lp = lp + 1;
                    } else {
                        break;
                    }
                }
                res[0] = fp;
                res[1] = lp;
                return res;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
