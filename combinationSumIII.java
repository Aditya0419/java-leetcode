import java.util.ArrayList;
import java.util.List;

public class combinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> li=new ArrayList<>();
        helper(li, new ArrayList<>(), k, n, 1, 0);
        return li;
    }
    public void helper(List<List<Integer>> li,List<Integer> temp,int k,int n,int si,int sum){
        
        if(sum==n && temp.size()==k){
            li.add(new ArrayList<>(temp));
        }
        else{
            for (int i = si; i <= 9; i++) {
                sum+=i;
                if(sum>n){
                    sum-=i;
                    return;
                }
                temp.add(i);
                helper(li,temp,k,n,i+1,sum);
                sum-=i;
                temp.remove(temp.size()-1);
            }
        }
    }
}
