import java.util.ArrayList;
import java.util.List;

public class combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> li=new ArrayList<>();  
        helper(li,new ArrayList<>(),1,n,k);  
    }
    public void helper(List<List<Integer>> li,List<Integer> temp,int si,int n,int k){
        if(temp.size()==k) li.add(new ArrayList<>(temp));
        else{
            for(int i=si;i<=n;i++){
                temp.add(i);
                helper(li,temp,i+1,n,k);
                // temp.remove(temp.size()-1);
            }
        }
    }

}
