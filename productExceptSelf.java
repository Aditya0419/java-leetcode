import java.util.Arrays;

public class productExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        prefix[0]=nums[0];
        suffix[nums.length-1]=nums[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
            prefix[i]=nums[i]*prefix[i-1];
            suffix[nums.length-i-1]=nums[nums.length-i-1]*suffix[nums.length-i];           
        }


        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                nums[i]=suffix[1];
            }else if(i==nums.length-1){
                nums[i]=prefix[nums.length-2];
            }else{
                nums[i]=prefix[i-1]*suffix[i+1];
            }
        }


        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        return nums;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
