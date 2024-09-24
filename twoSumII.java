import java.util.Arrays;

public class twoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int si=0;
        int ei=numbers.length-1;

        while(si<ei){
            if(numbers[si]+numbers[ei]==target){
                return new int[]{si+1,ei+1};
            }
            else if(numbers[si]+numbers[ei]<target){
                si++;
            }
            else if(numbers[si]+numbers[ei]>target){
                ei--;   
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr={-1,0};
        System.out.println(Arrays.toString(twoSum(arr, -1)));
    }
}
