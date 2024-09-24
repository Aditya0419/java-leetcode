import java.util.Arrays;

public class removeTargeArray {
    public static int removeElement(int[] nums, int val) {
        int pointerL=nums.length-1;
        int occurence=0;
        int i=0;
        if(nums.length==0) return 0;
        if(nums.length==1 && nums[0]==val){
            return -1;
        } 
        while (i!=pointerL) {
            if(nums[i]==nums[pointerL] && nums[i]==val){
                pointerL--;
                occurence++;
            }
            else if(nums[pointerL]==val) {
                pointerL--; 
                occurence++;
                
            }
            else if(nums[i]==val && nums[pointerL]!=val){
                int temp=nums[i];
                nums[i]=nums[pointerL];
                nums[pointerL]=temp;
                pointerL--;
                occurence++;
                i++;
            }
            else{
                i++;
                continue;
            }

        }
        return nums.length-occurence;
    }
    public static void main(String[] args) {
        int[] arr={1};
        
        System.out.println(removeElement(arr,1));
    }
}
