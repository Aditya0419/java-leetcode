import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class countGoodNodesinTree {
    public static  int countGoodNodes(int[][] edges) {
        int n=edges.length+1;
        List<List<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            // adj.get(edges[i][1]).add(edges[i][0]);
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = n-1; i >=0; i--) {
            System.out.println(hm);
            if(adj.get(i).isEmpty()) hm.put(i,0);
            else{
                int max=0;
                for (int j = 0; j < adj.get(i).size(); j++) {
                    System.out.println(adj.get(i).get(j));
                    int height=hm.get(adj.get(i).get(j))+1;
                    max=Math.max(max,height);
                }
                hm.put(i,max);
            }
        }
        int c=0;
        ArrayList<Integer> c1=new ArrayList<>();
        for (int i = n-1; i >=0; i--) {
            if(hm.get(i)==0){
                c++;
                c1.add(i);
            }
            else{
                boolean isGood = true;
                int firstChildHeight = hm.get(adj.get(i).get(0));
                for (int j = 1; j < adj.get(i).size(); j++) {
                    if (hm.get(adj.get(i).get(j)) != firstChildHeight) {
                        isGood = false;
                        break;
                    }
                }
                if (isGood){
                    c++;
                    c1.add(i);
                }
            }
        }

        System.out.println(hm+" "+adj+" "+c1);
        return c;
    }
    public static void main(String[] args) {
        int[][] edges = {{0,1},{1,2},{1,3},{1,4},{0,5},{5,6},{6,7},{7,8},{0,9},{9,10},{9,12},{10,11}};
        System.out.println(countGoodNodes(edges));
    }
}
