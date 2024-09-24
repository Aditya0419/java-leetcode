import java.util.Arrays;

public class removeDuplicatesII {
    public static int removeDuplicates(int[] nums) {
        int f = 0;
        int s = 0;

        while(s< nums.length){
            int count = 1;
            while((s+1) < nums.length && nums[s]==nums[s+1]){
                s++;
                count ++;
            }
            int dup = Math.min(count,2);
            for (int j = 0; j <dup ; j++) {
                nums[f]=nums[s];
                f++;
            }
            s++;
            }
        System.out.println(Arrays.toString(nums));
        return f;

    }
    public static void main(String[] args) {
        int[] n={0,0,1,1,1,1,2,3,3};
        removeDuplicates(n);
    }
}
