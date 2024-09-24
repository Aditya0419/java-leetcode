import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li=new ArrayList<>();
        helper(li, new ArrayList<>(), candidates, target, 0,0);
        return li;
    }
    public void helper(List<List<Integer>> li,List<Integer> temp,int[] candidates,int target,int sum,int si){
        if(sum==target) li.add(new ArrayList<>(temp));
        else{
            for (int i = si; i < candidates.length; i++) {
                sum+=candidates[i];
                if(sum>target){
                    sum-=candidates[i];
                    return;
                }
                temp.add(candidates[i]);
                helper(li,temp,candidates,target,sum,i);
                sum-=candidates[i];
                temp.remove(temp.size()-1);
            }
        }
    }
}
