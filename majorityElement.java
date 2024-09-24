import java.util.HashMap;

public class majorityElement{
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        if(nums.length==1) return nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(!hm.containsKey(nums[i])){
                System.out.println("if: "+ nums[i]);
                hm.put(nums[i], 1);
            }
            else if(hm.containsKey(nums[i])){
                int count=hm.get(nums[i])+1;
                hm.put(nums[i], count);
                System.out.println(count+" "+nums[i]);
                if(count>nums.length/2){
                    return count;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}