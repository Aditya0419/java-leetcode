import java.util.Arrays;

public class shiftRightByK {
    public static void reverseArr(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        if(nums.length==1 || k==nums.length) return;
        if(nums.length==2 ){
            if(k%2==0) return;
            else{
                int temp=nums[0];
                nums[0]=nums[1];
                nums[1]=temp;
                return;
            } 
        }
        if(k>nums.length){
            while(k>nums.length){
                k=k-nums.length;
            }
        }
        reverseArr(nums, 0, nums.length-1);
        reverseArr(nums, 0, k-1);
        reverseArr(nums, k, nums.length-1);
    }
    public static void main(String[] args) {
        int[] nums={2,3,4};
        rotate(nums, 1);
        System.out.println(Arrays.toString(nums));
    }
}
