import java.util.ArrayList;
import java.util.List;

public class powerSetOfArray {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        li.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            helper(li, new ArrayList<>(), nums, i);
        }
        return li;
    }
    public void helper(List<List<Integer>> li,List<Integer> temp,int[] nums,int si){
        if(temp.size()==nums.length) return;
        for (int i = si; i < nums.length; i++) {
            temp.add(nums[i]);
            li.add(new ArrayList<>(temp));
            helper(li,temp,nums,i+1);
        }
    }
}
