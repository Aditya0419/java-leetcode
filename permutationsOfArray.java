import java.util.ArrayList;
import java.util.List;

public class permutationsOfArray {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        helper(li, new ArrayList<>(), nums);
        return li;
    }
    public void helper(List<List<Integer>> li,List<Integer> temp,int[] nums){
        if(temp.size()==nums.length) li.add(new ArrayList<>(temp));
        else{
            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                helper(li, temp, nums);
                temp.remove(temp.size()-1); 
            }
        }
    }
}
